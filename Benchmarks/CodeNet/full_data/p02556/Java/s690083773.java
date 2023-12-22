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
            Pair[] arr=new Pair[n];
            for(int i=0;i<n;i++){
                arr[i]=new Pair(scan.nextInt(),scan.nextInt());
            }
            Arrays.sort(arr);
            Pair p1=arr[0];
            Pair p2=arr[1];
            if(p2.y>p1.y){
                Pair temp=p2;
                p2=p1;
                p1=temp;
            }
            int ans=Math.abs(p1.x-p2.x)+Math.abs(p1.y-p2.y);
            for(int i=2;i<n;i++){
                Pair p3=arr[i];
                ans=Math.max(Math.abs(p1.x-p3.x)+Math.abs(p1.y-p3.y),ans);
                ans=Math.max(Math.abs(p2.x-p3.x)+Math.abs(p2.y-p3.y),ans);
                if(p3.y>p1.y){
                    if(p3.x-p1.x<p3.y-p1.y){
                        p1=p3;
                    }
                }
                if(p3.y<p2.y){
                    if(p3.x-p2.x<p2.y-p3.y){
                        p2=p3;
                    }
                }
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        Pair(int x,int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            return this.x-o.x;
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
