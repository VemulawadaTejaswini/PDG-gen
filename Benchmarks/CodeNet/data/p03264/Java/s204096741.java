import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int k = Integer.parseInt(sc.nextLine());
      System.out.println(solve(k));
    }
  }

  public static int solve(int k) {
    int even = k / 2;
    int odd = (k + 1) / 2;
    return even * odd;
  }
}
