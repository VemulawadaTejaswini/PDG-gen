import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] ss = br.readLine().split("\\s");
        double[] arr = new double[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = Double.parseDouble(ss[i]);
        }
        double mod = Math.pow(10, 9) + 7;
        double res = 0;
        int k = n;
        int p = 0, q = n-1;
        while(k >= 3)
        {
            if(arr[p] + arr[p+1] > arr[q] + arr[q-1])
            {
                res = (res + (arr[q] + arr[q-1])%mod)%mod;
                arr[q-1] = (arr[q] + arr[q-1])%mod;
                n = n-1;
                q = q-1;
                k = k-1;
            }
            else
            {
                res = (res + arr[p] + arr[p+1])%mod;
                arr[p+1] = (arr[p] + arr[p+1])%mod;
                p = p + 1;
                k = k - 1;
            }
        }
        System.out.println((int)((res + arr[p] + arr[q])%mod));
    }
}