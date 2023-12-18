import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long ans = 0;
    while ((N /= K) > 0) {
      ans++;
    }
    System.out.println(ans + 1);
  }
}
