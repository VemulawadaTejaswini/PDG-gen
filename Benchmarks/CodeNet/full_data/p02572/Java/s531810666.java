import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // int型へ変換
    var N = Integer.parseInt(str_scan);

    String str_scan2 = scan.nextLine();
    // スペース区切りで分ける
    var A = str_scan2.split(" ");
    long[] work = new long[N];

    //long型に変換
    for (var x = 0;x < N;x++){
      work[x] = Long.parseLong(A[x]);
    }

    var k = 0;
    long ans = 0;

    long MOD = 1000000007;

    for (var i = 0;i<N-1;i++){
      for ( var j = i+1;j<N;j++){
        ans += (work[i] * work[j]) % MOD;
        ans %= MOD;
      }
    }

    System.out.println(ans);
    scan.close();
  }
}