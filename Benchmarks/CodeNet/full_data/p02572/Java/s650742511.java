import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static MyScanner scan;
    public static PrintWriter out;
    public static void main(String[] args) {
        scan=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));

        int t=1;
//        int t=scan.nextInt();
        while(t-->0) {

            int n=scan.nextInt();
            long mod=1000000007,ans=0;

            long[] a=new long[n],b=new long[n];
            for(int i=0;i<n;i++) a[i]=scan.nextLong();
            b[0]=a[n-1];
            b[0]%=mod;
            for(int i=1;i<n;i++) {
                b[i]=b[i-1]+a[n-i-1];
                b[i]%=mod;
            }

            for(int i=0;i<n-1;i++) {
                ans+=(b[n-i-2]*a[i]);
                ans%=mod;
            } out.println(ans);
        }
        out.close();
    }

//    int n=scan.nextInt();
//    long[] a=new long[n];
//    long ans=0,mod=1000000007,sum=0;
//            for(int i=0;i<n;i++) {
//        a[i]=scan.nextLong();
//        sum+=a[i];
//        sum%=mod;
//    }
//
//            for(int i=0;i<n;i++) {
//        sum-=a[i];
//        ans+=(sum*a[i]);
//        ans%=mod;
//    } out.println(ans);

    //scanner
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
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