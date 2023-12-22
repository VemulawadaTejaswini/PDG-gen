/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

/**
 *
 * @author baito 
 */
public class Main
{
    static StringBuilder sb = new StringBuilder();
    static FastScanner sc = new FastScanner(System.in);
    static int kosuu ;
    static int  N,M, max = 0;
    static int[] A , C2;
    //static List<Integer>  = new ArrayList<>();
    
    public static void main(String[] args)
    {
        while(true){
             N = sc.nextInt();
             M = sc.nextInt();
             A = new int[N];
             C2 = new int[N * N];
             
             if(N  == 0 ){
                 break;
             } 
             
             //1つ選ぶ場合
             for (int i = 0; i < N; i++) {
                 A[i] = sc.nextInt();
                 chooseMax(A[i]);
            }
            
             //2つ選ぶ場合
             makeC2();
             Arrays.sort(C2);
             
             //3つ選ぶ場合
             for (int i = 0; i < N; i++) {
                 int tempMax = binarysearch( 0, N * N, A[i]);
                 //max = Math.max(tempMax, max);
                 chooseMax(tempMax);
            }
             //4つ選ぶ場合
             for (int i = 0, ite = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                     int tempMax = binarysearch( 0, N * N, A[i] + A[j]);
                    //max = Math.max(tempMax, max);
                    chooseMax(tempMax);

                }
            }
             
             
            System.out.println(max);
            max = 0;
        }
        
    }
    
    static int binarysearch( int ok, int ng,int sum){
    //int ok = 0; //解が存在する
    //int ng = N; //解が存在しない
        int mid = -1;
        while(Math.abs(ok - ng) > 1)
        {
            mid = (ok + ng) / 2;
            if (sum + C2[mid] <= M)
            {
                ok = mid;
            }
            else
            {
                ng = mid;
              }
        }
        if(mid == -1){
            return -1;
        }
        return sum + C2[ok];
    }
    private static void chooseMax(int a) {
        if(a <= M){
            max = Math.max(a, max);
        }
    }
    
    private static void makeC2() {
        for (int i = 0,ite = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C2[ite] = A[i] + A[j];
                chooseMax(C2[ite++]);
            }
        }
    }

    //dep iranai
    private static void func(int sum, int chooseNum) {
        if(sum > M){
            return ;
        }
        if(chooseNum == kosuu){
            max = Math.max(max, sum);
            return ;
        }
        for (int i = 0; i < N; i++) {
            func(sum + A[i], chooseNum + 1);
        }
        
    }
//    private static void func(int dep ,int sum, int chooseNum) {
//        if(sum > M){
//            return ;
//        }
//        if(dep == N || chooseNum == kosuu){
//            max = Math.max(max, sum);
//            return ;
//        }
//        func(dep + 1 ,sum ,chooseNum);
//        func(dep + 1 ,sum + A[dep] ,chooseNum + 1);
//        
//    }
    
    static int gcd(int n, int r) { return r == 0 ? n : gcd(r, n%r); }
    static long gcd(long n, long r) { return r == 0 ? n : gcd(r, n%r); }
	
    static <T> void swap(T[] x, int i, int j) { T t = x[i]; x[i] = x[j]; x[j] = t; }
    static void swap(int[] x, int i, int j) { int t = x[i]; x[i] = x[j]; x[j] = t; }
    
    static class FastScanner {

        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
        
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        /*public String nextChar(){
            return (char)next()[0];
        }*/
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            
            return tokenizer.nextToken("\n");
        }
        
        public long nextLong() {
            return Long.parseLong(next());
        }
        
        public int nextInt() {
            return Integer.parseInt(next());
        }
        
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
        public int [][] nextIntArray2(int h, int w){
            int[][] a = new int[h][w];
            for(int hi = 0 ; hi < h ; hi++){
                for(int wi = 0 ; wi < w ; wi++){
                    a[hi][wi] = nextInt();
                }
            }
            return a;
        }
         public Integer[] nextIntegerArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
        public char[] nextCharArray(int n){
            char[] a = next().toCharArray();
            
            return a;
        }
        public char[][] nextCharArray2(int h , int w){
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++) {
                a[i] = next().toCharArray();
            }
            return a;
        }
        public char[][] nextWrapCharArray2(int h , int w){
            char[][] a = new char[h + 2][w + 2];
            
            for (int i = 1; i < h + 1; i++) {
                a[i] = (" " + next() + " ").toCharArray();
            }
            return a;
        }
        
        
       
        
        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }
        public long [][] nextLongArray2(int h, int w){
            long[][] a = new long[h][w];
            for(int hi = 0 ; hi < h ; hi++){
                for(int wi = 0 ; wi < h ; wi++){
                    a[h][w] = nextLong();
                }
            }
            return a;
        }
    }
}

