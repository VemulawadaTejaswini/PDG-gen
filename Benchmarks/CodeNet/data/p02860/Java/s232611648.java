import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    char[] c = sc.next().toCharArray();

    int j = String.valueOf(c).substring(1).indexOf(c[0]) + 1;

    if (N % 2 != 0) {
      System.out.println("No");
      return;
    }

    for (int i = 0; i+j < N; i++) {
      // System.out.println(c[i] + ":" + c[i+j]);
      if (c[i] != c[i+j]) {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");
  }
}