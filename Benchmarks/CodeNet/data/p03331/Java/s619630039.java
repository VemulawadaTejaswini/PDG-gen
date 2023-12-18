import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    solve(N);
  }

  private static void solve(int N) {
    int digit[] = new int[6];
    int ans = 0;
    digit[0] = N % 10;
    digit[1] = N / 10 % 10;
    digit[2] = N / 100 % 10;
    digit[3] = N / 1000 % 10;
    digit[4] = N / 10000 % 10;
    digit[5] = N / 100000 % 10;
    
    for (int i=0; i<6; i++) {
      ans += digit[i];
    }
    
    if (ans == 1) {
      ans = 10;
    }
    System.out.println(ans);
  }
}
