import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力
        MyScanner sc = new MyScanner(System.in);
        String[] line1 = sc.nextStringArray();
        String[] line2 = sc.nextStringArray();
        String[] line3 = sc.nextStringArray();

        // 初期化
        int[] a = new int[3];
        int[] b = new int[3];
        int[][] c = new int[3][3];
        boolean ansFlg = false;

        for (int i = 0; i < 3; i++) {
            c[0][i] = Integer.parseInt(line1[i]);
            c[1][i] = Integer.parseInt(line2[i]);
            c[2][i] = Integer.parseInt(line3[i]);
        }

        // 主処理
        for (int i = 0; i <= 100; i++) {
            // a1の値を仮で決める
            a[0] = i;
            // b1,b2,b3を決める(bj = c1,j - a1)
            b[0] = c[0][0] - a[0];
            b[1] = c[0][1] - a[0];
            b[2] = c[0][2] - a[0];
            // b1を利用してa2,a3を決める(ai = ci,1 - b1)
            a[1] = c[1][0] - b[0];
            a[2] = c[2][0] - b[0];
            // ci,j = ai + bj が成立しているかチェックする
            // System.out.println("a=" + Arrays.toString(a));
            // System.out.println("b=" + Arrays.toString(b));
            boolean checkOk = true;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (c[j][k] != a[j] + b[k]) {
                        checkOk = false;
                        break;
                    }
                }
            }
            if (checkOk == true) {
                ansFlg = true;
                break;
            }
        }

        // 出力
        System.out.println(ansFlg ? "Yes" : "No");
    }

    static class MyScanner {
        BufferedReader br;
        // 標準入力から入力値を取得
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
