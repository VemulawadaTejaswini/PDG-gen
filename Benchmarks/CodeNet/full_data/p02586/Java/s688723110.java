//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
public class Main {
    static long[][][] dp;
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] Args)throws Exception{
        FastReader scan=new FastReader(System.in);
        int t=1;
//        t=scan.nextInt();
        while(t-->0){
            int r=scan.nextInt();
            int c=scan.nextInt();
            int k=scan.nextInt();
            int[][] mat=new int[r][c];
            for(int i=0;i<k;i++){
                int ri=scan.nextInt();
                int ci=scan.nextInt();
                mat[ri-1][ci-1]=scan.nextInt();
            }
            dp=new long[r][c][4];
            for(int i=r-1;i>=0;i--){
                for(int j=c-1;j>=0;j--){
                    for(int l=0;l<4;l++){
                        long fi=0;
                        if(j<c-1){
                            fi=dp[i][j+1][l];
                        }
                        long se=0;
                        if(i<r-1){
                            se=dp[i+1][j][3];
                        }
                        long th=0;
                        if(l>0){
                            th=mat[i][j];
                            if(j<c-1){
                                th+=dp[i][j+1][l-1];
                            }
                            th=Math.max(th,mat[i][j]+se);
                        }
                        dp[i][j][l]=Math.max(fi,Math.max(th,se));
                    }
                }
            }
            out.println(dp[0][0][3]);
        }
        out.flush();
        out.close();
    }
    static long recur(int[][] mat,int i,int j,int r,int c,long[][][] dp,int avai){
        if(i==r||j==c){
            return 0;
        }
        if(dp[i][j][avai]!=-1){
            return dp[i][j][avai];
        }
        dp[i][j][avai]=0;
        long fi=recur(mat,i,j+1,r,c,dp,avai);
        long se=recur(mat,i+1,j,r,c,dp,3);
        long th=0;
        if(avai>0) {
            th=mat[i][j]+recur(mat,i,j+1,r,c,dp,avai-1);
            th=Math.max(th,mat[i][j]+se);
        }
        dp[i][j][avai]=Math.max(fi,Math.max(th,se));
        return dp[i][j][avai];
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
