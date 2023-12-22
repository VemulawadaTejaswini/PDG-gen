import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 1000 - (n % 1000);
    ans = ans == 1000 ? 0 : ans;
    System.out.println(ans);
    sc.close();
  }
}