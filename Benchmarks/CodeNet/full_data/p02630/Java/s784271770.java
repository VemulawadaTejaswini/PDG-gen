import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] seq = new int[n];
    for (int i = 0; i < n; i++) {
      seq[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    // 差だけを計算する
    Arrays.sort(seq);
    int[] sumSeq = new int[q];
    int tmp = 0;
    // 初期配列の合計
    for (int i : seq) {
      tmp += i;
    }
    for (int j = 0; j < q; j++) {
      int b = sc.nextInt();
      int c = sc.nextInt();
      int count = 0;
      // 個数を求めることseq[]の書き換え
      for (int k = 0; k < n; k++) {
        if (seq[k] == b) {
          count++;
          seq[k] = c;
        }
      }
      tmp += (c-b) * count;
      sumSeq[j] = tmp; //回数分
    }
    for (int ans : sumSeq) {
      System.out.println(ans);
    }
  }
}
