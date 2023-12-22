import java.util.*;
import java.io.*;

public class Main {	
	static long mod = 1000000007;
	private static void solve(){
		//Implement solution here.
		int N = ni();
		int K = ni();
		int[] A = na(N);
		long result = 0;
		Arrays.sort(A);
		int fidx = 0;
		int bidx = N - 1;
		//All negative
		int cnt = 0;
		if(A[bidx] <= 0) {
			while(cnt < K) {
				if(result == 0) result = 1L;
				result = modMul(result, A[fidx]);
				cnt++;
				fidx++;
			}
			
		} else if(A[fidx] >= 0) {
			//All positive
			while(cnt < K) {
				if(result == 0) result = 1L;
				result = modMul(result, A[fidx]);
				cnt++;
				fidx++;
			}
			
		} else {
			int negcnt = 0;
			while(fidx <= bidx && cnt < K) {
				//System.out.println(A[fidx] + " " + A[bidx]);
				if(Math.abs(A[fidx]) > Math.abs(A[bidx])) {
					if(A[fidx + 1] >= 0 && negcnt % 2 == 0) {
						if(result == 0) result = 1L;
						result = modMul(result, A[bidx]);
						cnt++;
						bidx--;
					} else {
						if(result == 0) result = 1L;
						result = modMul(result, A[fidx]);
						cnt++;
						fidx++;
						negcnt++;
					}
				} else {
					if(result == 0) result = 1L;
					result = modMul(result, A[bidx]);
					cnt++;
					bidx--;
				}
//				System.out.println(result);
			}
		}
		System.out.println(result);
	}


	static long modMul(long a, long b) {
		return ((a % mod) * (b % mod)) % mod;
	}

	//Switch input source (stdin/file)
	private static BufferedReader br;
	public static void main(String[] args){
		br = new BufferedReader(new InputStreamReader(System.in));
		String debugDataPath = System.getenv("DD_PATH");        
		if(debugDataPath != null){
			try{
				br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath))));
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
		boolean hasNext = true;
		while(hasNext){
			solve();	
			try{
				br.mark(1);
				if(br.read() > 0){
					br.reset();			
					System.out.println("---");
				} else {
					hasNext = false;
				}
			}catch(Exception e){
				throw new RuntimeException(e);
			} 
		}
	}

	//Input read utility
	private static StringTokenizer tokenizer = null;
	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}
	//Get next single int
	private static int ni() {
		return Integer.parseInt(next());
	}
	//Get next single long
	private static long nl() {
		return Long.parseLong(next());
	}
	//Get next single double
	private static double nd() {
		return Double.parseDouble(next());
	}
	//Get next int array from one line
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	//Get next char array from one line
	private static char[] ns() {
		return next().toCharArray();
	}
	//Get next long array from one line
	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
}
