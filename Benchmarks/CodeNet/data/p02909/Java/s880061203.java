import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		String S = next();
		String[] weather = {"Sunny", "Cloudy", "Rainy"};

		if(S.equals(weather[0])) {
			out.println(weather[1]);
		}else if(S.equals(weather[1])) {
			out.println(weather[2]);
		}else if(S.equals(weather[2])) {
			out.println(weather[0]);
		}

	}


	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

}