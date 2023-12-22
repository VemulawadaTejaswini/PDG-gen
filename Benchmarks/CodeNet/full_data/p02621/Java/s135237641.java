//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
public class Main {
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] Args)throws Exception{
        FastReader scan=new FastReader(System.in);
//        int t=1;
//        t=scan.nextInt();
//        while(t-->0){
//            int[][] mat={{1,0,1},{1,1,0},{1,1,0}};
//            numSubmat(mat);
//        }
        int a=scan.nextInt();
        out.println(a+a*a+a*a*a);
        out.flush();
        out.close();
    }
    static int numSubmat(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        // System.out.println(n+" "+m);
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]==1){
                    mat[i][j]+=mat[i][j-1];
                }
                // System.out.print(mat[i][j]+" ");
            }
            // System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    mat[i][j]+=mat[i-1][j];
                }
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
                ans+=mat[i][j];
            }
            System.out.println();
        }
        return ans;
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
