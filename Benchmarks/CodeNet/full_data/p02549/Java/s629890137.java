//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
public class Main {
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] Args)throws Exception{
        FastReader scan=new FastReader(System.in);
        int t=1;
//        t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int k=scan.nextInt();
            long[] dp=new long[n];
            long mod=998244353;
            ArrayList<Pair> ks=new ArrayList<>();
            for(int i=0;i<k;i++){
                ks.add(new Pair(scan.nextInt(),scan.nextInt()));
            }
            long[] ps=new long[n];
            ps[0]=1;
            dp[0]=1;
            for(int i=1;i<n;i++){
                long ans=0;
                for(Pair cur:ks){
                    int l=cur.x;
                    int r=cur.y;
                    int ri=i-l;
                    int li=Math.max(0,i-r);
                    if(ri>=li){
                        ans=(ans+ps[ri])%mod;
                    }
                    if(li>0){
                        ans=(ans-ps[li-1]+mod)%mod;
                    }
                }
                dp[i]=ans;
                ps[i]=(ps[i-1]+dp[i])%mod;
            }
            out.println(dp[n-1]);
        }
        out.flush();
        out.close();
    }
    static class Pair{
        int x;
        int y;
        Pair(int x,int y) {
            this.x = x;
            this.y = y;
        }
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Pair)) return false;
//            Pair key = (Pair) o;
//            return x == key.x && y == key.y;
//        }
//
//        @Override
//        public int hashCode() {
//            int result = x;
//            result = 31 * result + y;
//            return result;
//        }
    }
    static class fenwickTree{
        int[] arr;
        fenwickTree(int[] ar){
            arr=new int[ar.length+1];
            for(int i=0;i<ar.length;i++){
                update(i,ar[i]);
            }
        }
        fenwickTree(int n){
            arr=new int[n+1];
        }
        void update(int i,int nv){
            int in=i+1;
            while(in<arr.length){
                arr[in]+=nv;
                in+=(in&(-in));
            }
        }
        int query(int i){
            int sum=0;
            int in=i+1;
            while(in>0){
                sum+=arr[in];
                in=(in&(in-1));
            }
            return sum;
        }
    }
    static class FastReader {

        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;

        FastReader(InputStream is) {
            in = is;
        }

        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }

        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan()) ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }

        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
}
