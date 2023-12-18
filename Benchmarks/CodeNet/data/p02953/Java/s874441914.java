import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] h = new int[n];

    boolean hasDec = false;

    h[0] = sc.nextInt();
    for (int i = 1; i < n; ++i) {
      h[i] = sc.nextInt();

      if (h[i] <= h[i - 1] - 2 ||
          h[i] < h[i - 1] && hasDec) {
        System.out.println("No");
        System.exit(0);
      }
      if (h[i] < h[i - 1])
        hasDec = true;
    }

    System.out.println("Yes");
  }
}