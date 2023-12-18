import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		ABC50A p = new ABC50A();
		p.solve();
	}
}

class ABC50A {
	public void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		long a = Long.parseLong(input[0]);
		long b = Long.parseLong(input[2]);
		if (input[1].equals("+"))
			System.out.println((a + b));
		else
			System.out.println((a - b));
	}
}