import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
//    private static Scanner sc = new Scanner(System.in);
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        // 解答ここから
        int N = nextInt();
        int[] X = arrayOfInt();
        int[] x = X.clone();
        Arrays.sort(x);
        // 中央値の境界を取る
        int floor = N/2 - 1;
        int border = x[floor];

        int a = x[floor + 1];
        int b = x[floor];
        for(int i = 0;i < N;i++){
            if(X[i] <= border){
                println(a);
            }else{
                println(b);
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
    // 出力
    static void println(Object val){System.out.println(val);}
}
