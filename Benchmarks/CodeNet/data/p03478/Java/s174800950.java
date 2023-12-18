import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int maxNum = sc.nextInt();
    int minSum = sc.nextInt();
    int maxSum = sc.nextInt();

    int[] nums = new int[maxNum + 1];
    for (int i = 0; i <= maxNum; i++) {
      char[] chars = Integer.toString(i).toCharArray();
      int sums = 0;
      for (int j = 0; j < chars.length; j++) {
        sums += Character.getNumericValue(chars[j]);
      }
      if (sums >= minSum && sums <= maxSum) {
        nums[i] = i;
      }
    }
    List<Integer> list = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toList());
    int result = list.stream().mapToInt(Integer::intValue).sum();
    System.out.println(result);
  }
}