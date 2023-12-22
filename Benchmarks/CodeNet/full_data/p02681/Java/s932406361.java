

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastScanner in = new FastScanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		if(s2.substring(0, s1.length()).equals(s1)) System.out.println("Yes");
		else System.out.println("No");
	}

}
///////////////////////////////////TEMPLATE///////////////////////////////////
class FastScanner {
	BufferedReader br;
	StringTokenizer st;

	FastScanner(InputStream stream) {
		try {
			br = new BufferedReader(new InputStreamReader(stream));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	FastScanner(File input) {
		try {
			br = new BufferedReader(new FileReader(input));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	String nextLine() {
		String s = "";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}

	String next() {
		while (st == null || !st.hasMoreTokens()) {
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
}