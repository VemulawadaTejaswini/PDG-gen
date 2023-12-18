import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int ans = 0;
    int i = 0;
    for (; i < ((k < n)? k : n); i++)
      ans += x;
    for (; i < n; i++)
      ans += y;
    System.out.println(ans);
  }
}