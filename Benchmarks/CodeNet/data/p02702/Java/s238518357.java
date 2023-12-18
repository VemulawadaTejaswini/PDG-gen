import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {
	//FastScannerクラス、普通の Scannerクラスだとメモリと時間を大幅に喰らうので高速化する内部クラス。
	
	public static void main(String[]args) {
		FastScanner sc = new FastScanner(System.in);
		
		String S = sc.next();
		
		String[] T = new String[S.length()+1];
		
		Map<String,Integer>map = new TreeMap<String,Integer>();
		T[S.length()] = "0";
		map.put(T[S.length()], 1);
		COMinit();
		

		for(int i = 0;i<S.length();i++) {
			T[i] = S.substring(i, S.length());
			BigDecimal big = new BigDecimal(T[i]);
			T[i] = big.remainder(new BigDecimal("2019")).toString();
			//System.out.println(T[i]);
			if(!map.containsKey(T[i])) {
				map.put(T[i], 1);
			}else {
				map.put(T[i], map.get(T[i])+1);
			}
		}
		
		long goukei = 0;
		
		for(String Key:map.keySet()) {
			//System.out.print(Key);
			//System.out.print(" ");
			//System.out.println(map.get(Key));
			if(map.get(Key)>=2)goukei+=COM(map.get(Key),2);
		}
		//System.out.println();
		System.out.println(goukei);
		
		
		
		
		
		
		
		
	}
	
	//拡張ユークリッドでの逆元の求め方でnCkをつくる、前処理必須。
	
		static  int MAX = 510000;
		static  int MOD = 1000000007;

		 static long[] fac = new long[MAX]; 
		 static long[] finv = new long[MAX]; 
		 static long[] inv = new long[MAX]; 

		// テーブルを作る前処理
		static void COMinit() {
		    fac[0] = fac[1] = 1;
		    finv[0] = finv[1] = 1;
		    inv[1] = 1;
		    for (int i = 2; i < MAX; i++){
		        fac[i] = fac[i - 1] * i % MOD;
		        inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
		        finv[i] = finv[i - 1] * inv[i] % MOD;
		    }
		}

		// 二項係数計算
		static long COM(int n, int k){
		    if (n < k) return 0;
		    if (n < 0 || k < 0) return 0;
		    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
		}
			
	
	static class FastScanner {
		 
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
 
		public FastScanner(InputStream source) {
			in = source;
		}
 
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
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
 
		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}
 
		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}
 
		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		}
 
		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
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
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}

}
