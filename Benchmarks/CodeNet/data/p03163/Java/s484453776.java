
/*
 -> Written by <-
   -----------
  |J_O_B_E_E_L|
  |___________|
  |    ___    |
  |   (^_^)   |
  |  /( | )\  |
  |____|_|____|
*/
 
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.nio.file.Path;
import java.util.Map.*;


public class Main {
	static long [][] memo;
	static int N,W;
	static int [] weight,values;
	static long solve(int i,int x) {
		if(i==N || x<0) return 0;
		if(memo[i][x]!=-1) return 0;
		if(x-weight[i]>=0)
		      return memo[i][x]=Math.max(solve(i+1,x),1l*values[i]+solve(i+1,x-weight[i]));
		 return memo[i][x]=solve(i+1,x);
	}
	public static void main(String[] args) throws IOException{
		N=sc.nextInt(); W =sc.nextInt();
		weight=new int [N];
		values=new int [N];
		memo =new long [105][100005];
		for(long []a:memo) Arrays.fill(a,-1);
		for(int i=0;i<N;i++) {
			weight[i]=sc.nextInt();
			values[i]=sc.nextInt();
		}
		
		pw.println(solve(0,W));
        pw.flush();
        pw.close();
    }
   
	static int p = 31;
	static int m = (int)1e9 + 9;
	static long [] p_pow;
	static long [] hash;
	static void creatp_pow(int n) {
		p_pow=new long [n];
		p_pow[0]=1;
		for(int i=1;i<n;i++)
			p_pow[i]=(p_pow[i-1]*p)%m;
	}
	static void creatHash(char [] ch) {
		hash=new long [ch.length+1];
		for(int i=0;i<ch.length;i++)
			hash[i+1]=(hash[i]+(ch[i]-'a'+1)*p_pow[i])%m;
	}
	
    static  class pair implements Comparable <pair>{
        int x,y; int x1; long y1;
        public pair(int x,int y){this.x=x; this.y=y;}
 
        public int compareTo(pair o) {
           if(o.x!=x) return x-o.x;
           return y-o.y;
        }
        public pair(int x1, long y1) {
        	this.x1=x1;
        	this.y1=y1;
        }
        public String toString(){
            return  x+" "+y;
        }
        
    }
    static PrintWriter pw = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static class Scanner {
 
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int curbuf;
        private int lenbuf;
 
        public Scanner(InputStream in) {
            this.in = in;
            this.curbuf = this.lenbuf = 0;
        }
 
        public boolean hasNextByte() {
            if (curbuf >= lenbuf) {
                curbuf = 0;
                try {
                    lenbuf = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0)
                    return false;
            }
            return true;
        }
 
        private int readByte() {
            if (hasNextByte())
                return buffer[curbuf++];
            else
                return -1;
        }
 
        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }
 
        private void skip() {
            while (hasNextByte() && isSpaceChar(buffer[curbuf]))
                curbuf++;
        }
 
        public boolean hasNext() {
            skip();
            return hasNextByte();
        }
 
        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (!isSpaceChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
 
        public int nextInt() {
            if (!hasNext())
                throw new NoSuchElementException();
            int c = readByte();
            while (isSpaceChar(c))
                c = readByte();
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = readByte();
            } while (!isSpaceChar(c));
            return (minus) ? -res : res;
        }
 
        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            int c = readByte();
            while (isSpaceChar(c))
                c = readByte();
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = readByte();
            } while (!isSpaceChar(c));
            return (minus) ? -res : res;
        }
 
        public double nextDouble() {
            return Double.parseDouble(next());
        }
 
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
 
        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
 
    }
 
}