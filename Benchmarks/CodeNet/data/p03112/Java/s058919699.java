import java.util.*;
import java.io.*;

public class Main {
	private static void solve(){
	//Implement solution here.
		int a = ni();
		int b = ni();
		int q = ni();
		long s[] = new long[a];
		long t[] = new long[b];

		for(int i = 0; i < a; i++){
			s[i] = nl();
		}
		for(int i = 0; i < b; i++){
			t[i] = nl();
		}
		for(int i = 0; i < q; i++){
			long x = nl();
			long ab = Long.MIN_VALUE;
			long af = Long.MAX_VALUE;
			for(int j = 0; j < a; j++){
				if(s[j] > x)break;
				if(ab < s[j] - x){
					ab = s[j] - x;
				}
			}
			for(int j = a - 1; j >= 0; j--){
				if(s[j] < x)break;
				if(af > s[j] - x){
					af = s[j] - x;
				}
			}
			
			long bb = Long.MIN_VALUE;
			long bf = Long.MAX_VALUE;
			for(int j = 0; j < b; j++){
				if(t[j] > x)break;
				if(bb < t[j] - x){
					bb = t[j] - x;
				}
			}
			for(int j = b - 1; j >= 0; j--){
				if(t[j] < x)break;
				if(bf > t[j] - x){
					bf = t[j] - x;
				}
			}
			//System.out.println(ab + " " + bb + " " + af + " " + bf);
			long result = Long.MAX_VALUE;
			//ff
			result = Math.max(af,bf);
			//System.out.println(result);
			//fb
			result = Math.min(result, 2*Math.min(Math.abs(af),Math.abs(bb)) + Math.max(Math.abs(af),Math.abs(bb)));
			// System.out.print("fb:");
			// System.out.println(2*Math.min(Math.abs(af),Math.abs(bb)) + Math.max(Math.abs(af),Math.abs(bb)));
			//bf
			result = Math.min(result, 2*Math.min(Math.abs(ab),Math.abs(bf)) + Math.max(Math.abs(ab),Math.abs(bf)));
			// System.out.println("rs:" + result);
			// System.out.print("bf:");
			// System.out.println(2*Math.min(Math.abs(ab),Math.abs(bf)) + Math.max(Math.abs(ab),Math.abs(bf)));
			//bb
			if(Math.min(ab,bb) != Long.MIN_VALUE){
				result = Math.min(result, Math.abs(Math.min(ab,bb)));
			}
			//System.out.println("bb" + Math.abs(Long.MIN_VALUE + 1));
			System.out.println(result);
		}
	}

    //Switch input source (stdin/file)
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
        String debugDataPath = System.getenv("DD_PATH");        
        if(debugDataPath != null){
            try{
                scanner = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath)))));
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
				tokenizer = new StringTokenizer(scanner.nextLine());
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