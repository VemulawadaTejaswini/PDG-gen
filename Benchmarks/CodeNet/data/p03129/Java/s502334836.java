import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    if (n >= ((2 * (k - 1)) + 1)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}