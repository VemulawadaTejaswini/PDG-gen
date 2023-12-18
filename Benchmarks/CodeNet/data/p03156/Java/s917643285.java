import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int n1 = 0;
    int n2 = 0;
    int n3 = 0;

    for (int i = 0; i < n; i++) {
      int p = sc.nextInt();
      if (p <= a) {
        n1++;
      } else if (p <= b) {
        n2++;
      } else {
        n3++;
      }
    }

    System.out.println(Math.min(Math.min(n1, n2), n3));

  }
}