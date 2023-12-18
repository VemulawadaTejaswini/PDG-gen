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
        int[] input = arrayOfInt();
        int n = input[0];
        int m = input[1];

        int MAX = Math.floorDiv(m,n);
        long ans = 1;
//        for(int i = 2;i <= Math.sqrt(m);i++){
//            if (m%i != 0) continue;
//            if(i <= MAX) ans = Math.max(ans,i);
//            if(m/i <= MAX) ans = Math.max(ans,m/i);
//        }
        for (int i = 2; i <= Math.sqrt(m); ++i) {
            if (m % i != 0) continue;
            if(i <= MAX) ans = Math.max(ans,i);
            if (m / i <= MAX) ans = Math.max(ans,m/i);
        }
        println(ans);
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