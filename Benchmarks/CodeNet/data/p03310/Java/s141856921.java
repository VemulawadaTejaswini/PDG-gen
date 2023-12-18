import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        long[] a = in.nl(n);
        for (int i = 1; i < n; i++) a[i] += a[i-1];
        long min = INF;
        for (int i = 1; i < n - 2; i++) {
            int l = 0, r = i-1;
            long max_l=0, max_r=0, min_l=0,min_r=0;
            while(r-l>0){
                int mid = (l+r)/2;
                if(a[mid]>a[i]-a[mid]){
                    if(r==mid) break;
                    r = mid;
                }else if(a[i]-a[mid]>a[mid]){
                    if(l==mid) break;
                    l = mid;
                }else{
                    max_l = a[mid];
                    min_l = a[mid];
                }
            }
            if(max_l==0){
                if(l==r){
                    if(l==0){
                        max_l = a[0];
                        min_l = a[i]-a[0];
                    }else if(r==i-1){
                        max_l = a[i]-a[i-1];
                        min_l = a[i-1];
                    }else{
                        max_l = Math.max(a[i]-a[l],a[l]);
                        min_l = Math.min(a[i]-a[l],a[l]);
                    }
                }else if(a[i]<a[r]+a[l]){
                    max_l = a[i]-a[l];
                    min_l = a[l];
                }else{
                    max_l = a[r];
                    min_l = a[i]-a[r];
                    break;
                }
            }
            if(max_l<min_l){
                long temp = max_l;
                max_l = min_l;
                min_l = temp;
            }
            l = i+1; r = n-2;
            while(r-l>0){
                int mid = (l+r)/2;
                if(a[mid]-a[i]>a[n-1]-a[mid]){
                    if(r==mid) break;
                    r = mid;
                }else if(a[n-1]-a[mid]>a[mid]-a[i]){
                    if(l==mid) break;
                    l = mid;
                }else{
                    max_r = a[mid];
                    min_r = a[mid];
                    break;
                }
            }
            if(max_r==0){
                if(l==r){
                    if(l==i+1){
                        max_r = a[i+1]-a[i];
                        min_r = a[n-1]-a[i+1];
                    }else if(r==n-2){
                        max_r = a[n-1]-a[n-2];
                        min_r = a[n-2]-a[i];
                    }else {
                        max_r = Math.max(a[n - 1] - a[l], a[l] - a[i]);
                        min_r = Math.min(a[n - 1] - a[l], a[l] - a[i]);
                    }
                }else if(a[i]+a[n-1]<a[r]+a[l]){
                    max_r = a[n-1]-a[l];
                    min_r = a[l]-a[i];
                }else{
                    max_r = a[r]-a[i];
                    min_r = a[n-1]-a[r];
                }
            }
            if(max_r<min_r){
                long temp = max_r;
                max_r = min_r;
                min_r = temp;
            }
            min = Math.min(min, Math.abs(Math.max(max_r,max_l)-Math.min(min_l,min_r)));
        }
        out.println(min);
    }

    public static void main(String[] args){
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
        out.close();
    }
    public static class InputReader{
        private BufferedReader br;
        private StringTokenizer st;
        public InputReader(InputStream is){
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }
        public String ns(){
            if(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
        public int ni(){
            return Integer.parseInt(ns());
        }
        public long nl(){
            return Long.parseLong(ns());
        }
        public double nd(){
            return Double.parseDouble(ns());
        }
        public char nc(){
            return ns().toCharArray()[0];
        }
        public int[] ni(int n){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }
        public long[] nl(int n){
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nl();
            }
            return a;
        }
        public double[] nd(int n){
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nd();
            }
            return a;
        }
    }
}