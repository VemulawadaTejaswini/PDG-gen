import java.util.*;
import java.io.*;

public class Main {
	private static void solve(){
		//Implement solution here.
		char[] s = next().toCharArray();
		char[] ca = {'k','e','y','e','n','c','e'};
		boolean skipped = false;
		boolean skipping = false;
		int cur = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] != ca[cur]) {
				if(skipping) {
					continue;
				} else {
					if(skipped) {
						System.out.println("NO");
						return;
					} else {
						skipped = true;
						skipping = true;
					}
				}
			} else {
				skipping = false;
				if(cur < ca.length - 1) {
					cur++;
				} else {
					if(i == s.length - 1) {
						System.out.println("YES");
						return;
					} else {
						if(skipped) {
							System.out.println("NO");
							return;
						}else {
							System.out.println("YES");
							return;
						}
					}
				}
			}
		}
		
		if(cur == ca.length - 1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
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
