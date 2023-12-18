import java.util.*;
import java.io.*;

public class Main {

	private static void solve(){
		//Implement solution here.
		int n = ni();
		int[][] xyh = new int[n][3];
		for(int i = 0; i < n; i++) {
			xyh[i][0] = ni();
			xyh[i][1] = ni();
			xyh[i][2] = ni();
		}
		
		for(int i = 0; i <= 100; i++) {
			for(int j = 0; j <= 100; j++) {
				boolean ok = true;
				int tmp = xyh[0][2] + Math.abs(xyh[0][0] - j) + Math.abs(xyh[0][1] - i);
				for(int k = 1; k < n; k++) {
					if((xyh[k][2] + Math.abs(xyh[k][0] - j) + Math.abs(xyh[k][1] - i) != tmp)) {
						ok = false;
						break;
					}
				}
				if(ok) {
					System.out.println(j + " " + i + " " + (tmp));
					return;
				}
			}
		}
	}



	//Switch input source (stdin/file)
	private static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args){
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