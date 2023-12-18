import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long A = scanner.nextInt();
    long B = scanner.nextInt();
    long C = scanner.nextInt();
    int tot = 0;
    while (allEven(A, B, C)) {
      if (allSame(A, B, C)) {
        System.out.println(-1);
        return;
      }
      long newA = (B + C) / 2;
      long newB = (A + C) / 2;
      long newC = (A + B) / 2;
      A = newA;
      B = newB;
      C = newC;
      tot++;
    }
    System.out.println(tot);
  }

  private static boolean allSame(long... nums) {
    return nums[0] == nums[1] && nums[1] == nums[2];
  }

  private static boolean allEven(long... nums) {
    for (long n : nums) if (n % 2 != 0) return false;
    return true;
  }
}
