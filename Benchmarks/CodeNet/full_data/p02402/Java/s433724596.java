import java.util.Scanner;

public class Main {

  private static int n;

  static int list_min(int[] nums) {
    int min = nums[0];
    for (int list_num : nums) {
      if (min > list_num) {
        min = list_num;
      }
    }
    return min;
  }

  static int list_max(int[] nums) {
    int max = nums[0];
    for (int list_num : nums) {
      if (max < list_num) {
        max = list_num;
      }
    }
    return max;
  }

  static int list_sum(int[] nums) {
    int sum = 0;
    for (int list_num : nums) {
      sum += list_num;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    n = stdIn.nextInt();
    int[] input_numbers = new int[n];

    for (int i = 0;i < n;i++) {
      input_numbers[i] = stdIn.nextInt();
    }
    System.out.println(list_min(input_numbers) + " " + list_max(input_numbers) + " " + list_sum(input_numbers));
  }
}