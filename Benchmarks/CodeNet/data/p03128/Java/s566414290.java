import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
 

public class Main {	
	
	public static void main(String[] args) throws Exception {
		
		//int N = scan.nextInt();
		//long L = scan.nextLong();
		//double D = scan.nextDouble();
		//char[] A = scan.next().toCharArray();
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] matches = new int[8];
		int MAX = Integer.MAX_VALUE;
		Arrays.fill(matches, MAX);
		int[] A = new int[M];
		for(int i=0; i<M; i++)A[i] = scan.nextInt();
		Arrays.sort(A);

		for(int num : A){
			switch(num){
				case 1:
					matches[2] = num;
					break;
				case 7:
					matches[3] = num;
					break;
				case 4:
					matches[4] = num;
					break;
				case 2:
				case 3:
				case 5:
					matches[5] = num;
					break;
				case 6:
				case 9:
					matches[6] = num;
					break;
				case 8:
					matches[7] = num;
					break;
			}
		}

		String dp[] = new String[N+1];
		Arrays.fill(dp, null);
		dp[0] = "";
		for(int i=2; i<=N; i++){
			for(int j=2; j<=7; j++){
				if(matches[j] == MAX)continue;
				if(i-j<0)continue;
				if(dp[i-j] == null)continue;
				if(dp[i] == null)dp[i] = "";
				char[] tmp = dp[i-j].toCharArray();
				char insert = (char)((int)'0' + matches[j]);
				String new_tmp = "";
				boolean inserted = false;
				for(int k=0; k<tmp.length; k++){
					if(insert >= tmp[k]){
						new_tmp = 
							String.valueOf(Arrays.copyOfRange(tmp, 0, k))
							+insert
							+String.valueOf(Arrays.copyOfRange(tmp, k, tmp.length));
						inserted = true;
						break;
					}
				}
				if(!inserted){
					new_tmp = String.valueOf(tmp) + String.valueOf(insert);
				}
				
				if(dp[i].length() <= new_tmp.length() && dp[i].compareTo(new_tmp) <= 0)dp[i] = new_tmp;
			}
		}

		//for(String s : dp)	out.println(s);
		out.println(dp[N]);
		out.flush();
	}
	
	static FastScanner scan = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);			 
	static long MOD = 1_000_000_007;

	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int[] dx8 = {1,-1,0,0,1,1,-1,-1};
	static int[] dy8 = {0,0,1,-1,1,-1,1,-1};

	//GCD最大公約数を返す
	static long gcd(long a, long b){
		if(b == 0) return a;
		return gcd(b, a%b);
	}

	//aとbの最小公倍数を返す
	static long lcm (long a, long b) {
		return ((a/gcd(a,b))*b);
	}
	
	//入力
	//https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte() {
	        if (ptr < buflen) {
	            return true;
	        }else{
	            ptr = 0;
	            try {
	                buflen = in.read(buffer);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            if (buflen <= 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	    public String next() {
	        if (!hasNext()) throw new NoSuchElementException();
	        StringBuilder sb = new StringBuilder();
	        int b = readByte();
	        while(isPrintableChar(b)) {
	            sb.appendCodePoint(b);
	            b = readByte();
	        }
	        return sb.toString();
	    }
	    public long nextLong() {
	        if (!hasNext()) throw new NoSuchElementException();
	        long n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if (b == '-') {
	            minus = true;
	            b = readByte();
	        }
	        if (b < '0' || '9' < b) {
	            throw new NumberFormatException();
	        }
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
	                throw new NumberFormatException();
	            }
	            b = readByte();
	        }
	    }
	    public int nextInt() {
	        long nl = nextLong();
	        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
	        return (int) nl;
	    }
	    public double nextDouble() { return Double.parseDouble(next());}
	}
}
