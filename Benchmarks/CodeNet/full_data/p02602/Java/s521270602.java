import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] inp = bu.readLine().split(" ");
        int n = Integer.parseInt(inp[0]), k = Integer.parseInt(inp[1]);
        inp = bu.readLine().split(" ");
        BigInteger[] arr = new BigInteger[n+1];
        int MOD = 1000000000;
        arr[0] = new BigInteger("1");
        for (int pos = 1; pos <= n; pos++) {
            arr[pos] = BigInteger.valueOf(Integer.parseInt(inp[pos-1]));
        }
        for (int pos = 2; pos <= n; pos++) {
            arr[pos] = arr[pos].multiply(arr[pos-1]);
        }
        for (int pos = k+1; pos <= n; pos++) {
            if ((arr[pos].divide(arr[pos - k])).compareTo(arr[pos - 1].divide(arr[pos - k - 1])) > 0)
                sb.append("Yes\n");
            else
                sb.append("No\n");
        }
        System.out.print(sb);
    }
}
