import java.util.*;
import java.io.*;

public class Main {	
	private static void solve(){
		//Implement solution here.
		String N = next();
		int D = N.length();
		int head = N.charAt(0) - 48;
		int K = ni();
//		System.out.println(D + " " + head);

		char[] c = N.toCharArray();
		long[] n = new long[D];
		for(int i = 0; i < D; i++) {
			n[i] = (long)c[i] - 48;
		}
		
		long result = 0;
		for(int i = 1; i < D; i++) {
			if(i < K) {
				continue;
			} else {
				result += 9 * combi(i - 1, K - 1) * (long)Math.pow(9, K - 1);
			}
//			System.out.println(i + " " + (9 * combi(i - 1, K - 1) * (long)Math.pow(9, K - 1)) + " " + result);
		}
		
		result += (head - 1) * combi(D - 1, K - 1) * (long)Math.pow(9, K - 1);
//		System.out.println(result);
		//Maximum digits
		if(K == 1) {
			result += 1;
		} else if(K == 2) {
			for(int i = 1; i < D; i++) {
				if(i == 1) {
					result += n[i];
				}else {
					result += 9;
				}
//				System.out.println(n[i]);
			}
		} else {
			for(int i = 1; i < D; i++) {
				if(n[i] == 0)continue;
				for(int j = i + 1; j < D; j++) {
					if(n[j] == 0)continue;
					if(i == 1) {
						result += n[i] * 9;
					}else {
						result += 81;
					}
				}
			}
		}
		System.out.println(result);
		

	}
	
	/**
	 * Simple nCk without mod calculation.
	 * @param n
	 * @param k
	 * @return nCk
	 */
	static long combi(int n, int k) {
		double out = 1;
		for(int i = 0; i < k; i++) {
			out = (out * (double)(n - i) / (k - i));
		}
		return (long)out;
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
		solve();
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
