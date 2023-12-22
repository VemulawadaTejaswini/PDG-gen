import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int v = sc.nextInt();
    int b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();
    int dist = Math.abs(a - b);
    int relvel = v - w;
    for (int i = 0; i < t; i++) {
      if (relvel * i == dist) {
        System.out.println("YES");
        System.exit(0);
      }
    }
    System.out.println("No");
  }
}