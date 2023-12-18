import java.util.*;
import java.io.*;

public class Main {	
	private static void solve(){
		//Implement solution here.
		int n = ni();
		List<Robot> rl = new ArrayList<Main.Robot>();
		for(int i = 0; i < n; i++) {
			int x = ni();
			int l = ni();
			rl.add(new Robot(x - l + 1, x + l - 1));
		}
		Comparator<Robot> comparator = Comparator.comparing(Robot::getRight);
		rl.sort(comparator);
		List<Robot> result = new ArrayList<Main.Robot>();
		for(int i = 0; i < n; i++) {
			Robot a = rl.get(i);
			boolean duplicate = false;
			for(int j = 0; j < result.size(); j++) {
				Robot b = result.get(j);
				if(a.getLeft() <= b.getRight()) {
					duplicate = true;
					break;
				}
			}
			if(!duplicate)result.add(a);
		}
		System.out.println(result.size());
	}

	static class Robot{
		private int left;
		private int right;
		public Robot(int left, int right) {
			this.left = left;
			this.right = right;
		}
		public int getLeft() {
			return this.left;
		}
		public int getRight() {
			return this.right;
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
