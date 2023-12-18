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
    public static void main(String[] args)
    {
        
        int N = sc.nextInt();
        int[] A = sc.nextIntArray(N);
        int[] sumList = new int[N];
        
        
        int ansSum = 1;//kotae
        //int cou = 1;//jibun
        int sum = A[0];//and no katamari
        int left = 0;
        
        for (int i = 1; i < N;) {
            if((sum & A[i]) == 0){
                sum ^= A[i];
                ansSum += i - left + 1;
                i++;
            }else{
                sum ^= A[left];
                left++;
                
            }
        }
        
        
        
        /*int i = 0;
        
        for (; i < N; i++) {
            if(( sum & A[i]) == 0){
                sum ^= A[i];
                //cou++;
            }else{
                ansSum += (i- left ) * (i - left + 1 ) / 2;//cou * (cou+1) /2;//(i- left + 1) * (i - left + 2) / 2;//cou * (cou+1) /2;
                while((sum & A[i]) != 0){
                    sum -= A[left];
                    left++;
                    if(left == i){
                        sum = 0;
                        break;
                    }
                    
                }
                i--;
                
            }
        }
        //最後にループ分から抜けてしまうため
        ansSum += (i- left ) * (i - left + 1 ) / 2;

        // migidake
        /*for (int i = 1; i < N; i++) {
            if(( sum & A[i]) == 0){
                sum += A[i];
                //cou++;
            }else{
                ansSum += i - left;//(i- left + 1) * (i - left + 2) / 2;//cou * (cou+1) /2;
                while((sum & A[i]) != 0){
                    sum -= A[left];
                    left++;
                    if(left == i){
                        ansSum++;
                        sum = A[i];
                        break;
                    }
                    
                }
                
            }
        }*/
        
        System.out.println(ansSum);
        
        
    }
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
