import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        func();
        pw.flush();
        return;
    }

    static void func() throws IOException {
        int N = nextInt();
        int[] x = new int[100];
        int[] y = new int[100];
        int[] h = new int[100];

        // 入力を処理
        for(int i = 0;i < N;i++){
            int[] input = arrayOfInt();
            x[i] = input[0];
            y[i] = input[1];
            h[i] = input[2];
        }

        // 全ての座標が頂点だった場合を探索する
        for(int posX = 0;posX <= 100;posX++){
            for(int posY = 0;posY <= 100;posY++){
                int top = 0;
                // posX,posYが頂点だった場合に、N個の入力が矛盾しないかを確かめる
                for(int i = 0;i < N;i++){
                    // 高さが0の入力は一旦無視する
                    if(h[i] > 0) {
                        int tmpH = h[i] + Math.abs(posX - x[i]) + Math.abs(posY - y[i]);
                        if(top == 0){
                            top = tmpH;
                        }else{
                            if(top != tmpH){
                                top = -1;
                                break;
                            }
                        }
                    }
                }
                if(top > 0){
                    println(posX + " " + posY + " " + top);
                }
            }
        }
        return;
    }
    // 入力受け取り
    static String next() throws IOException {return br.readLine();}
    static int nextInt() throws IOException{return getInt(br.readLine());}
    static long nextLong() throws IOException{return getLong(br.readLine());}
    static String[] arrayOfString() throws IOException{return br.readLine().split(" ");}
    static int[] arrayOfInt() throws IOException{return toIntArray(arrayOfString());}
    // 変換
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {return Integer.parseInt(val);}
    static int[] toIntArray(String[] array) {return Stream.of(array.clone()).mapToInt(Integer::parseInt).toArray();}
    static String joinToString(String[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < array.length;i++) sb.append(array[i]);
        return sb.toString();
    }

    // 出力
    static void println(Object val){pw.println(val);}
}
