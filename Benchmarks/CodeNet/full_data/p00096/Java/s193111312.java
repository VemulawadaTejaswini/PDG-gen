import java.util.*;
import java.io.*;

public class Main {
	public void solve() throws IOException {
		while( stdIn.hasNext()  ){
			long n = stdIn.nextInt();
			writer.println((n+3)*(n+2)*(n+1)/6);
		//	writer.flush();
		}
		writer.flush();
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	Scanner stdIn;
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;

	public void run() throws IOException {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			stdIn = new Scanner(reader);
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			stdIn.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String nextToken() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}
}