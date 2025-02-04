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
            long[] a=new long[n];
            long sum=0,ans=0,mod=(long)1e9+7;
            for(int c=0;c<n;c++) {
                a[c]=scan.nextLong();
                sum+=a[c];
                sum%=mod;
            }

            for (int c=0;c<n;c++) {
                sum-=a[c];
                ans+=(sum*a[c]);
                ans%=mod;
            } out.println(ans%mod);

        }
        out.close();
    }


//    int n=scan.nextInt();
//    long sum=0,mod=(long)1000000007;
//    long[] a=new long[n];
//            for(int c=0;c<n;c++) a[c]=scan.nextLong();
//    HashSet<String> check=new HashSet<>();
//            for(int i=0;i<n;i++) {
//        for(int j=0;j<n;j++) {
//            if(!check.contains(i+" "+j)&&!check.contains(j+" "+i)&&i!=j) {
//                sum+=a[i]*a[j];
//                check.add(i+" "+j);
//                check.add(j+" "+i);
////                        out.println(sum);
//            }
//        }
//    } out.println(sum%mod);

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