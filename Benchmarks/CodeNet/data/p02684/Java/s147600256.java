import java.util.*;
import java.io.*;

public class Main {	
	private static void solve(){
		//Implement solution here.
		int N = ni();
		long K = nl();
		int[] A = na(N);
		//Find loop size
		int[] steps = new int[N];
		
		int posbefore = 1;
		int pos = 1;
		int step = 1;
		while(true) {
			//System.out.println(step + " " + steps[pos - 1]);
			if(steps[pos - 1] == 0) {
				steps[pos - 1] = step;
				posbefore = pos;
				pos = A[pos - 1];
				step++;
			} else {
				step--;
				break;
			}			
		}		
		int loopstart = steps[pos - 1];
//		Arrays.stream(steps).forEach(v -> System.out.print(v + " "));
//		System.out.println();
//		System.out.println(step);
//		System.out.println(loopstart);
		
		K -= loopstart - 1;
		int stepmod = (int)(K % (step - loopstart + 1));
		//System.out.println(stepmod);
		for(int i = 0; i < stepmod; i++) {
			pos = A[pos];
		}
		
		System.out.println(pos);
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
