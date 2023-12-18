import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (char c: A.toCharArray())sb.append(c+"#"); //ダミー文字を突っ込む
        char[] s = sb.toString().toCharArray();
        long N = s.length;
        long max = 0;
        
        long[] rad = new long[N];
        for (int i=0, j=0; i<N;) {
            while(0 <= i-j && i+j < N && s[i-j]==s[i+j]) j++; //rad[i]を素直に求める
            rad[i] = j;
            max = Math.max(max, j); // 最大値は記憶しておく
            // 計算しなくても求められる部分を走査
            int k;
            for (k=1; 0 <= i-k && i+k < N && rad[i-k] < rad[i]-k; k++) {
                rad[i+k] = rad[i-k];
            }
            i+=k; // 次のinteresting position
            j = Math.max(j-k, 0); // interesting position は rad[i]-kと同じか長い回文を持つので考慮させる
        }
    long kaibun = 0;
    for(int i = 0; i < N; i++) {
      kaibun += rad[i];
    }
    long ans = 1 + ((n - 1) * n) / 2 - kaibun;
    System.out.println(ans);
  }
}