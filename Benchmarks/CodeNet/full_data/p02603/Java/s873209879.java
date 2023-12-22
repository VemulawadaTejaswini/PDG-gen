

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int [] arr = new int[n];
        int [] brr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            brr[i]=arr[i];
        }
        Arrays.sort(brr);
        int flag=1;
        for(int i=0;i<n;i++){
            if(arr[i]!=brr[i]){
                flag=0;
                break;
            }
        }
        if(flag==0)
            System.out.println(getMaxVal(arr,n));
        else{
            int mon =1000;
            int stocks=0;
            stocks=(mon/arr[0]);
            mon-=(stocks*arr[0]);
            mon+=stocks*arr[n-1];
            System.out.println(mon);
        }

    }
    static int getMaxVal(int arr[], int n)
    {
        int mon =1000;
        int stocks=0;

        for (int i = 1; i < n; i++)
        {
            if (isPeak(arr, n, arr[i], i - 1, i + 1) && isTrough(arr,n,arr[i-1],i-2,i))
            {
                stocks=(mon/arr[i-1]);
                mon-=(stocks*arr[i-1]);
                mon+=stocks*arr[i];
                stocks=0;
            }
        }

        return mon;
    }
    static boolean isPeak(int arr[], int n, int num,
                          int i, int j)
    {

        if (i >= 0 && arr[i] > num)
        {
            return false;
        }

        if (j < n && arr[j] > num)
        {
            return false;
        }
        return true;
    }

    static boolean isTrough(int arr[], int n, int num,
                            int i, int j)
    {

        if (i >= 0 && arr[i] < num)
        {
            return false;
        }

        if (j < n && arr[j] < num)
        {
            return false;
        }
        return true;
    }
    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if ((n % 2 == 0 && n > 2) || n < 2)
            return false;
        else {
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }


    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}