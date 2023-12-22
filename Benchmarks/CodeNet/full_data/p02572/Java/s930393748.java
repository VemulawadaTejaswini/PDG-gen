import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(buffer.readLine());
        String [] inp = buffer.readLine().split(" ");
        int [] arr = new int[n];
        for (int pos = 0; pos < n; pos++) {
            arr[pos] = Integer.parseInt(inp[pos]);
        }
        int mod = (int) (1e9+7);
        long [] suffSum = new long[n];
        suffSum[n-1] = arr[n-1];
        for (int pos = n-2; pos >=0 ; pos--) {
            suffSum[pos] = arr[pos]+suffSum[pos+1]%mod;
            suffSum[pos]%=mod;
        }
        long sum = 0;
        for (int pos = 0; pos < n - 1; pos++) {
            sum+= (arr[pos]%mod*suffSum[pos+1]%mod)%mod;
            sum%=mod;
        }
        System.out.println(sum);
    }
}
