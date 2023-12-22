

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  private static int solve1(int W, List<Integer> values, List<Integer> weights, List<Integer> numbers) {
    int[] dp = new int[W + 1];
    for (int i = 1; i <= values.size(); ++i) {
      for (int j = W; j >=0; --j) {
        int v = values.get(i - 1);
        int w = weights.get(i - 1);
        int c = numbers.get(i - 1);
        for (int k = 1; k <= c; ++k) {
          if (j - k * w >= 0) {
            dp[j] = Math.max(dp[j], dp[j - k * w] + k * v);
          }
        }
      }
    }
    return dp[W];
  }

  private static int solve2(int W, List<Integer> values, List<Integer> weights, List<Integer> numbers) {
    List<Integer> newValues = new ArrayList<>();
    List<Integer> newWeights = new ArrayList<>();
    for (int i = 0; i < numbers.size(); ++i) {
      List<Integer> newNums = decompose(numbers.get(i));
      for (int num : newNums) {
        newValues.add(num * values.get(i));
        newWeights.add(num * weights.get(i));
      }
    }
    int[] dp = new int[W + 1];
    for (int i = 1; i <= newValues.size(); ++i) {
      for (int j = W; j >= 0; --j) {
        int v = newValues.get(i - 1);
        int w = newWeights.get(i - 1);
        if (j - w >= 0) {
          dp[j] = Math.max(dp[j], dp[j - w] + v);
        }
      }
    }
    return dp[W];
  }

  private static List<Integer> decompose(int num) {
    List<Integer> res = new ArrayList<>();
    int ele = 1;
    while (num - ele + 1 > 0) {
      res.add(ele);
      ele <<= 1;
    }
    int last = res.get(res.size() - 1);
    res.set(res.size() - 1, num - last + 1);
    return res;
  }

  private static final Pattern SPLIT = Pattern.compile("\\s");
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> weights = new ArrayList<>();
    List<Integer> values = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();
    List<Integer> NW = Stream.of(SPLIT.split(scanner.nextLine())).map(Integer::valueOf)
        .collect(Collectors.toList());
    final int N = NW.get(0);
    final int W = NW.get(1);
    for (int i = 0; i < N; ++i) {
      List<Integer> collect = Stream.of(SPLIT.split(scanner.nextLine())).map(Integer::valueOf)
          .collect(Collectors.toList());
      values.add(collect.get(0));
      weights.add(collect.get(1));
      numbers.add(collect.get(2));
    }
    System.out.println(solve2(W, values, weights, numbers));
  }
}