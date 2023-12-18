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

        // 入力つめる
        for(int i = 0;i < N;i++){
            int[] input = arrayOfInt();
            x[i] = input[0];
            y[i] = input[1];
            h[i] = input[2];
        }

        // posX,posYが頂点だった場合に、N個の入力が矛盾しないかを全て確かめる
        for(int posX = 0;posX <= 100;posX++){
            for(int posY = 0;posY <= 100;posY++){
                // 問題文よりH = 0は存在しないため頂点の高さを0として仮置きする
                int top = 0;
                for(int i = 0;i < N;i++){
                    // 高さが0の入力は一旦無視する
                    // ※最初の入力が0だと高さがうまく判定できないため
                    if(h[i] > 0) {
                        // 問題文よりX,Yの高さを求める式を立式
                        // h[i] = H - Math.abs(posX - x[i]) - Math.abs(posY - y[i])
                        // 式変形して下記で想定する頂点の高さを求める
                        // H = h[i] + Math.abs(posX - x[i]) + Math.abs(posY - y[i])
                        int tmpH = h[i] + Math.abs(posX - x[i]) + Math.abs(posY - y[i]);

                        // top=0の場合、暫定的に頂点を設定
                        if(top == 0){
                            top = tmpH;
                        }else{
                            // 想定される頂点と異なる頂点を取得した場合スキップ
                            if(top != tmpH){
                                top = -1;
                                break;
                            }
                        }
                    }
                }

                // 改めて高さが0の入力を確認する
                for(int i = 0;i < N;i++){
                    if(h[i] == 0) {
                        // 高さが0のX,Yがあるとき、Hは"少なくとも"
                        // Math.abs(posX - x[i]) + Math.abs(posY - y[i]) より大きくなる
                        // ※問題文に下記の式が存在するため、0以下の場合は0に補正されているので
                        // h[i] = Math.max(H - Math.abs(posX - x[i]) - Math.abs(posY - y[i]), 0)
                        int tmpH = Math.abs(posX - x[i]) + Math.abs(posY - y[i]);
                        if(top > tmpH){
                            top = -1;
                            break;
                        }
                    }
                }

                // ここまでで矛盾がない場合、正しい頂点のハズなので出力
                if(top > 0){
                    println(posX + " " + posY + " " + top);
                    return;
                }
            }
        }
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
