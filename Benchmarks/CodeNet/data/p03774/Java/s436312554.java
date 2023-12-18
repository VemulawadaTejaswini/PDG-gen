import java.io.InputStream;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

/**
 *
 * @author Pradyumn Agrawal coderbond007
 */

public class Main{
    public static InputStream inputStream = System.in;
    public static StringTokenizer tok = null;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(inputStream), 32768);
    public static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws java.lang.Exception{
        new Thread(null, new Runnable() {
            public void run() {
                try {
                    new Main().run();
                    out.close();
                } catch(IOException e){

                }
            }
        }, "1", 1 << 26).start();
    }
    public void run() throws IOException
    {
        int n = ni();
        int m = ni();
        Pair[] p1 = new Pair[n];
        Pair[] p2 = new Pair[m];
        for(int i = 0;i < n; i++){
            p1[i] = new Pair(ni(),ni());
        }
        for(int i = 0;i < m; i++){
            p2[i] = new Pair(ni(),ni());
        }
        for(int i = 0;i < n; i++){
            int ind1 = -1;
            int ind2 = -1;
            int mindis = Integer.MAX_VALUE;
            for(int j = 0;j < m; j++){
                int dist = dst(p1[i],p2[j]);
                if(dist < mindis){
                    ind1 = i + 1;
                    ind2 = j + 1;
                    mindis = dist;
                }
            }
            out.println(ind2);
        }

    }
    public static int dst(Pair p1, Pair p2)
    {
        return Math.abs(p1.ff - p2.ff) + Math.abs(p1.ss - p2.ss);
    }
    public class Pair implements Comparable<Pair>{
        public int ff;
        public int ss;
    
        public Pair(int ff, int ss){
            this.ff = ff;
            this.ss = ss;
        }
        public int compareTo(Pair in) {
            if(this.ff != in.ff) return this.ff - in.ff;
            if(this.ss != in.ss) return this.ss - in.ss;
            return 0;
        }
    }
    public static int ni() throws IOException {
        return Integer.parseInt(ns());
    }
    public static long nl() throws IOException {
        return Long.parseLong(ns());
    }
    public static double nd() throws IOException {
        return Double.parseDouble(ns());
    }
    public static char nc() throws IOException {
        return ns().charAt(0);
    }
    public static BigInteger nextBigInteger() throws IOException {
        return new BigInteger(ns());
    }
    public static String ns() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            try {
                tok = new StringTokenizer(br.readLine());
            } catch (IOException e){
                throw new RuntimeException(e);
            }
        }
        return tok.nextToken();
    }
    public static int[] na(int n) throws IOException {
        int[] a = new int[n];
        for(int i = 0;i < n; i++){
            a[i] = ni();
        }
        return a;
    }
    public static long[] nal(int n) throws IOException {
        long[] a = new long[n];
        for(int i = 0;i < n; i++){
            a[i] = nl();
        }
        return a;
    }
    public static char[] ns(int n) throws IOException {
        return ns().substring(0,n).toCharArray();
    }
    public static char[][] nm(int n, int m) throws IOException{
        char[][] map = new char[n][];
        for(int i = 0;i < n; i++){
            map[i] = ns(m);
        }
        return map;
    }
    public static String readLine() {
    	try {
    		return br.readLine();
    	} catch(IOException e){
    		throw new RuntimeException(e);
    	}
    }
}