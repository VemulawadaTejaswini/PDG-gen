
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int N, K;
    public static int MAX = 60;
    public static long[] x = new long[MAX], y = new long[MAX];


    public static void main(String[] args) throws IOException {

        //入力
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        for(int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        //出力
        solve();
    }

    public static void solve() {
        long ans = 5000000000000000000L;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {
                    for(int l = 0; l < N; l++) {
                        int count = 0;
                        for(int m = 0; m < N; m++) {
                            if(x[i] <= x[m] && x[m] <= x[j] && y[k] <= y[m] && y[m] <= y[l]) count++;
                        }
                        if(count >= K) ans = Math.min(ans, (x[j] - x[i]) * (y[l] - y[k]));
                    }
                }
            }
        }
        System.out.println(ans);

    }

}