import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 標準入力から値を取得
    // *N：宿泊数, K：X円/日で泊まれる日数, X：K泊目以内の日毎宿泊費, Y：K+1泊目以降の日毎宿泊費
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    // NがK以下の場合、宿泊数 * Xを出力
    if(n <= k) {
      System.out.println(n * x);

    // NがKより大きい場合、K * X + (N - K) * Y を出力
    } else {
	  // *K + 1日目からN日目までの日数
      int z = n - k;
      System.out.println(k * x + z * y);
    }
  }
}