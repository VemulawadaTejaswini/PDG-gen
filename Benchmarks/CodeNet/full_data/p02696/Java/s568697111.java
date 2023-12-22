import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        long a=sc.nextLong(),b=sc.nextLong(),n=sc.nextLong();
//        ArrayList<Long> p=p(Math.abs(a-b));
//        for (int x=1;x<=n;x++){
//            System.out.println(a(a,b,x));
//        }
//        long mas=0;
//        for (long x:p){
//            if (x<=n){
//                mas=Math.max(mas,a(a,b,x));
//            }
//        }
        System.out.println(Math.min(a-1,n));
    }
    static ArrayList<Long> p(long x){
        ArrayList<Long> arr=new ArrayList<>();
        for (long i=1;i*i<=x;i++){
            if (x%i==0){
                arr.add(i);
                arr.add(x/i);
            }
        }
        return arr;
    }
    static long a(long a,long b,long x){
        return (a*x/b)-a*(x/b);
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