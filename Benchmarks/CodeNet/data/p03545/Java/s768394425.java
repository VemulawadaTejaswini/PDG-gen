import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));		
		
		char[] letters = sc.next().toCharArray();
		int[] numbers = new int[letters.length];
		
		for (int i = 0; i < letters.length; i++) {						
			String string = String.valueOf(letters[i]);
			numbers[i] = Integer.parseInt(string);
		}
		
		int N = letters.length-1;
		
		for (int i = 0; i < 1<<N; i++) {
			int total = numbers[0];
			String backup = String.valueOf(numbers[0]);
			for (int j = 0; j < N; j++) {
				if ((1&i>>j)==1) {
					backup+="+" + String.valueOf(numbers[j+1]);
					total += numbers[j+1];
					
				}else {
					backup+="-" + String.valueOf(numbers[j+1]);
					total -= numbers[j+1];
				}
			}
			if (total==7) {
				backup+="=7";
				out.println(backup);
				break;
			}
			
		}
		out.close();
	}

	//-----------http://codeforces.com/blog/entry/7018---------------------------------
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	//--------------------------------------------------------

}
