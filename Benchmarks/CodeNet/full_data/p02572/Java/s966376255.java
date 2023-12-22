import java.io.*;
import java.util.*;

import static java.lang.Integer.*;
import static java.lang.Long.parseLong;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter prnt = new PrintWriter(System.out);
        StringTokenizer st;
        int N = parseInt(read.readLine());
        long[] arr = new long[N];
        st = new StringTokenizer(read.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = parseLong(st.nextToken());
        }
        prnt.println(getSum(arr, N));
        prnt.close();
    }

    static long getSum(long[] arr, int N) {
        long mod = (long) (1e9 + 7);
        long Sum = 0;
        long[] preixSum = new long[N];
        preixSum[0] = arr[0];
        for (int i = 1; i < N; i++) {
            preixSum[i] += (preixSum[i - 1] + arr[i]);
        }
        for (int i = 0; i < (N - 1); i++) {
            Sum += ((arr[i] % mod) * ((preixSum[N - 1] - preixSum[i]) % mod)) % mod;
            Sum %= mod;
        }
        return Sum % mod;
    }
}
