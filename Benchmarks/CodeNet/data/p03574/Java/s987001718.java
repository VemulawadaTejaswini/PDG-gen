/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.*;

/**
 *
 * @author nai
 */
public class Main
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        FastScanner sc = new FastScanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        char[][] S = new char[H][W];
        for (int i = 0; i < H; i++) {
            S[i] = sc.next().toCharArray();
        }
        
        
        char[][] S2 = packArray2(S);
        
        int cou ;
        int[][] moveList = {{-1, -1}, {0, -1},{1, -1},
                            {-1, 0}          ,{1 , 0},
                            {-1, 1} , {0, 1} ,{1 , 1}};
        char[] numList = {'0','1','2','3','4','5','6','7','8','9'};
        
        for (int hi = 1; hi < H + 1; hi++) {
            for (int wi = 1; wi < W + 1; wi++) {
                //check bom
                cou = 0;
                if(S2[hi][wi] != '.'){
                    continue;
                }
                for(int[] iteAr : moveList){
                    if(S2[hi + iteAr[0]] [wi + iteAr[1]] == '#'){
                        cou++;
                    }
                }
                S2[hi][wi] = numList[cou];
            }
        }
        for (int hi = 1; hi < H + 1; hi++) {
            for (int wi = 1; wi < W + 1; wi++) {
                sb.append(S2[hi][wi]);
            }
            sb.append('\n');
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
        
    }
   
    public static char[][] packArray2(char[][] a){
        int h = a.length;
        int w = a[0].length;
        char[][] b = new char[h + 2][w + 2];
        
        //上の面を梱包する
        for (int i = 0; i < w + 2; i++) {
            b[0][i] = '*'; 
        }
        //中の梱包
        for (int i = 1; i < h + 1; i++) {
            
            b[i][0] = '*';
            for (int j = 1; j < w + 1; j++) {
                b[i][j] = a[i -1][j - 1];
            }
            b[i][w + 1] = '*';
        }
        //下の面を梱包する
        for (int i = 0; i < w + 2; i++) {
            b[h + 1][i] = '*'; 
        }
        return b;
    }
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
                for(int wi = 0 ; wi < h ; wi++){
                    a[h][w] = nextInt();
                }
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
