import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void fun(int n, long[] a, long[] b) {

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + 1) % 1000000007;// 单独放
            for (int j = i + 1; j < n; j++) {
                if (a[i] * a[j] + b[i] * b[j] != 0) {
                    ans = (ans + 1) % 1000000007;
                }
            }
        }
        System.out.println(ans);


    }



    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        int n = Integer.valueOf(line);

        long[] a = new long[n];
        long[] b = new long[n];

        for (int i = 0; i < n; i++) {
            line = in.readLine();
            String[] ss = line.split(" ");
            a[i] = Long.valueOf(ss[0]);
            b[i] = Long.valueOf(ss[1]);
        }
        fun(n, a, b);
    }
    public static void main2(String[] args) {

        long[] a = new long[]{1, -1, 2};
        long[] b = new long[]{2, 1, -1};
        fun(3, a, b);
    }
}
