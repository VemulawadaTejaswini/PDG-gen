import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main{
	static Scanner scn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();
	static PrintWriter ot = new PrintWriter(System.out);
	static Random rand = new Random();
	static int mod = 1000000007;
	static long modmod = (long)mod * mod;
	static long inf = (long)1e17;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int[] dx8 = {-1,-1,-1,0,0,1,1,1};
	static int[] dy8 = {-1,0,1,-1,1,-1,0,1};
	static char[] dc = {'R','D','L','U'};
	static BiFunction<Integer,Integer,Integer> fmax = (a,b)-> {return Math.max(a,b);};
	static BiFunction<Integer,Integer,Integer> fmin = (a,b)-> {return Math.min(a,b);};
	static BiFunction<Integer,Integer,Integer> fsum = (a,b)-> {return a+b;};
	static BiFunction<Long,Long,Long> fmaxl = (a,b)-> {return Math.max(a,b);};
	static BiFunction<Long,Long,Long> fminl = (a,b)-> {return Math.min(a,b);};
	static BiFunction<Long,Long,Long> fsuml = (a,b)-> {return a+b;};
	static BiFunction<Integer,Integer,Integer> fadd = fsum;
	static BiFunction<Integer,Integer,Integer> fupd = (a,b)-> {return b;};
	static BiFunction<Long,Long,Long> faddl = fsuml;
	static BiFunction<Long,Long,Long> fupdl = (a,b)-> {return b;};
	static String sp = " ";
	static int M;
	static long cnt;
	static HashSet<Integer> q;
	static HashMap<HashSet<Integer>,Integer> dp;
	static String[] S;
	public static void main(String[] args) {
		//AOJ1302 Twenty
		//author:Suunn
		//状況ごとにうまく特定できるまで各質問を試してみる感じの全探索っぽい？
		//再帰的にやると書きやすそう
		//Mの指数でも間に合いそうだけど、計算量はよくわかりません。上からO（N M!)くらいかな...
		//間に合わない　これ可能か？
		//再帰呼び出し回数を調べると6800万回。賢い枝狩りとかで行ける気もするけど...
		//とりあえずまだ質問していない番号の集合を持ってみます
		//けっこう早くなった
		//そもそもこの方針じゃ無理っぽい？
		//メモ化を試みる
		while(true) {
			M = sc.nextInt();
			int N = sc.nextInt();
			if(N==0)return;
			HashSet<Integer> s = new HashSet<Integer>();
			q = new HashSet<Integer>();
			S = new String[N];
			for(int i=0;i<N;i++)S[i] = sc.next();
			for(int i=0;i<M;i++)q.add(i);
			for(int i=0;i<N;i++)s.add(i);
			dp = new HashMap<HashSet<Integer>,Integer>();
			System.out.println(solve(s));
			
		}


	}
	private static int solve(HashSet<Integer> s) {
		if(dp.containsKey(s))return dp.get(s);
		if(s.size()<=1) return 0;
		cnt++;
		int min = M+1;
		HashSet<Integer> f = new HashSet<Integer>();
		for(int e:q)f.add(e);
		for(int e:f) {
			HashSet<Integer> s0 = new HashSet<Integer>();
			HashSet<Integer> s1 = new HashSet<Integer>();
			for(int i:s) {
				if(S[i].charAt(e)=='0')s0.add(i); 
				if(S[i].charAt(e)=='1')s1.add(i); 
					
				
			}
			if(s0.size()==0||s1.size()==0)continue;//無駄な質問なのでしなくていい。これをcontinueしないと無限ループに陥る
			q.remove(e);
			min = Math.min(min,Math.max(solve(s0),solve(s1)));
			q.add(e);
			if(min==0)break;
		}
		dp.put(s,min+1);
		return min+1;
	}
	


}




class FastScanner {
    private final java.io.InputStream in = System.in;
    private final byte[] b = new byte[1024];
    private int p = 0;
    private int bl = 0;
    private boolean hNB() {
        if (p<bl) {
            return true;
        }else{
            p = 0;
            try {
                bl = in.read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bl<=0) {
                return false;
            }
        }
        return true;
    }

	private int rB() { if (hNB()) return b[p++]; else return -1;}
    private static boolean iPC(int c) { return 33 <= c && c <= 126;}
    private void sU() { while(hNB() && !iPC(b[p])) p++;}
    public boolean hN() { sU(); return hNB();}
    public String next() {
        if (!hN()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = rB();
        while(iPC(b)) {
            sb.appendCodePoint(b);
            b = rB();
        }
        return sb.toString();
    }
    public char nextChar() {
    	return next().charAt(0);
    }
    public long nextLong() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b=='-') {
            m=true;
            b=rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1||!iPC(b)){
                return (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int nextInt() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b == '-') {
            m = true;
            b = rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b-'0';
            }else if(b==-1||!iPC(b)){
                return (int) (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int[] nextInts(int n) {
    	int[] a = new int[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public int[] nextInts(int n,int s) {
    	int[] a = new int[n+s];
    	for(int i=s;i<n+s;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public long[] nextLongs(int n, int s) {
    	long[] a = new long[n+s];
    	for(int i=s;i<n+s;i++) {
    		a[i] = nextLong();
    	}
    	return a;
	}
    public long[] nextLongs(int n) {
    	long[] a = new long[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextLong();
    	}
    	return a;
    }
    public int[][] nextIntses(int n,int m){
    	int[][] a = new int[n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			a[i][j] = nextInt();
    		}
    	}
    	return a;
    }

    public String[] nexts(int n) {
    	String[] a = new String[n];
    	for(int i=0;i<n;i++) {
    		a[i] = next();
    	}
    	return a;
    }
    void nextIntses(int n,int[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextInt();
    		}
    	}
    }
    void nextLongses(int n,long[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextLong();
    		}
    	}
    }

}






