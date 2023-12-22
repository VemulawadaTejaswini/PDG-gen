import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int A = Integer.valueOf(s.split(" ")[0]);
		int B = Integer.valueOf(s.split(" ")[1]);
		int C = Integer.valueOf(s.split(" ")[2]);
		int D = Integer.valueOf(s.split(" ")[3]);
		
		int h1 = A - C;
		
		
		
		if((A + B) > (C + D)) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}

class FastReader {
	BufferedReader bf;
	StringTokenizer st;

	public FastReader() {
		bf = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(bf.readLine());
			} catch (Exception e) {
				System.out.println(e);
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
			str = bf.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return str;
	}
}

