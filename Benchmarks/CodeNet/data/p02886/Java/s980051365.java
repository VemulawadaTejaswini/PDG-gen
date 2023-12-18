
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] nums = new int[N];
    for (int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }

    int result =0;
    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        result += nums[i] *nums[j];
      }
    }

    System.out.println(result);
  }





}
