import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //　整数の入力
    int N = sc.nextInt();
    int K = sc.nextInt();
    // 個数の計算
    int answer = K;
    for (int i=2; i<=N; i++) {
      answer *= (K - 1);
    }
    // 出力
    System.out.println(answer);
  }
}