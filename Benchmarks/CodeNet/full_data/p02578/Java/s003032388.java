import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int a1 = sc.nextInt();
    for (int i = 1; i < n; i++) {
      int a2 = sc.nextInt();
      if (a1 > a2) {
        int x = a1 - a2;
        sum += x;
        a1 = a2 + x;
      } else {
        a1 = a2;
      }
    }
    System.out.println(sum);
  }
}