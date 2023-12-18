import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力
        MyScanner sc = new MyScanner(System.in);
        int[] line1 = sc.nextIntArray();
        int A = line1[0];
        int B = line1[1];
        int C = line1[2];
        int D = line1[3];
        int E = line1[4];
        int F = line1[5];

        // 初期化
        int max_satou_mizu = 0;
        int max_satou = 0;
        int max_noudo = 0;

        // 主処理
        // 操作1,2,3,4の回数をa,b,c,dとして全探索
        for (int a = 0; a < 30; a++) {
            for (int b = 0; b < 30; b++) {
                for (int c = 0; c < 30; c++) {
                    for (int d = 0; d < 30; d++) {
                        if (0 == 100*A*a + 100*B*b) continue;
                        int mizu = 100*A*a + 100*B*b;
                        int satou = C*c + D*d;
                        int noudo = 100 * satou / (mizu + satou);
                        // 100A*a + 100B*b + C*c + D*d <= F
                        // C*c + D*d <= E
                        if ((mizu + satou <= F)
                            && (satou <= mizu / 100 * E)) {
                            // System.out.println("mizu=" + mizu);
                            // System.out.println("satou=" + satou);
                            // System.out.println("noudo=" + noudo);
                            // System.out.println("");
                            if (max_noudo < noudo) {
                                max_satou_mizu = mizu + satou;
                                max_satou = satou;
                                max_noudo = noudo;
                                // System.out.println("max_satou_mizu=" + max_satou_mizu);
                                // System.out.println("max_satou=" + max_satou);
                                // System.out.println("max_noudo=" + max_noudo);
                                // System.out.println("");
                            }
                        }
                    }
                }
            }
        }

        // 出力
        System.out.println(max_satou_mizu + " " + max_satou);
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
