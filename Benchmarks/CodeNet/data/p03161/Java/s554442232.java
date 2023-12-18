import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力
        MyScanner sc = new MyScanner(System.in);
        int[] line1 = sc.nextIntArray();
        int N = line1[0];
        int K = line1[1];
        int[] h = sc.nextIntArray();

        // 初期化
        int[] dp = new int[N];
        dp[0] = 0;

        // 主処理
        for(int i = 1; i < N; i++) {
            if(i == 1) {
                dp[i] = Math.abs(h[i] - h[i-1]);
            } else {
                // 最大値で仮定する
                dp[i] = Integer.MAX_VALUE;
                for(int j = 1; j < Math.min(i+1, K+1); j++) {
                    dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(h[i] - h[i-j]));
                }
            }
        }

        // 出力
        System.out.println(dp[N-1]);
    }

    static class MyScanner {
        BufferedReader br;
        MyScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }
        // 標準入力を文字列で取得
        public String nextString() throws IOException {
            return br.readLine();
        }
        // 標準入力を文字列の配列で取得
        public String[] nextStringArray() throws IOException {
            return nextString().split(" ");
        }
        // 標準入力を数値で取得
        public int nextInt() throws IOException {
            return Integer.parseInt(nextString());
        }
        // 標準入力を数値の配列で取得
        public int[] nextIntArray() throws IOException {
            String[] strArr = nextStringArray();
            int[] intArr = new int[strArr.length];
            for(int i = 0; i < strArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i]);
            }
            return intArr;
        }
    }
}
