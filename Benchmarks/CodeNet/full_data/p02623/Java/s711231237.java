

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        int [] arr =new int[n];
        int [] brr = new int[m];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        for(int i=0;i<m;i++)
            brr[i]=s.nextInt();
        int res=0;
        int n1=0;
        int m1=0;
        while(k>0){
            if(n1<n && m1<m){
                if(arr[n1]<=brr[m1]){
                    k-=arr[n1];
                    n1++;
                    if(k<0)
                        break;
                    res++;
                }
                else{
                    k-=brr[m1];
                    m1++;
                    if(k<0)
                        break;
                    res++;
                }
            }
            else if(n1<n){
                k-=arr[n1];
                n1++;
                if(k<0)
                    break;
                res++;
            }
            else if(m1<m){
                k-=brr[m1];
                m1++;
                if(k<0)
                    break;
                res++;
            }
            else{
                break;
            }

        }
        System.out.println(res);
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