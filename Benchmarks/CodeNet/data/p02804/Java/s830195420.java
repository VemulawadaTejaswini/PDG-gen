import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  static int mod = 1000000007;

  public static void main(String[] args) {
    Scanner std = new Scanner(System.in);
    int n = std.nextInt();
    int k = std.nextInt();
    int[] as = new int[n];
    for (int i = 0; i < n; i++) {
      as[i] = std.nextInt();
    }

    Arrays.sort(as);
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> tmp = new ArrayList<>();
    backtrack(res, tmp, as, k, 0);
    int ans = 0;
    for (int i = 0; i < res.size(); i++) {
      List<Integer> element = res.get(i);
      long min = element.get(0);
      long max = element.get(element.size() - 1);
      long diff = (max - min) % mod;
      ans += diff;
      ans %= mod;
    }

    System.out.println(ans);
  }

  static void backtrack(List<List<Integer>> out, List<Integer> tmp, int[] nums, int K, int start) {
    if (tmp.size() == K) {
      out.add(new ArrayList<>(tmp));
    } else {
      for (int i = start; i < nums.length; i++) {
        int value = nums[i];
        tmp.add(value);
        backtrack(out, tmp, nums, K, i + 1);
        tmp.remove(tmp.size() - 1);
      }
    }
  }
}
