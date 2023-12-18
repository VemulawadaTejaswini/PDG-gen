import java.util.*;
public class Main {
  public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int N = sc.nextInt();
    // 合計の計算
    int sum = 0;
    for (int i=1; i<=N; i++) {
      sum += i;
    }
    // 出力
    System.out.println(sum);
  }
}