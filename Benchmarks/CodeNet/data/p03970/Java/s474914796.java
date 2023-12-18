
import static java.lang.System.in;
import static java.lang.System.out;

import java.io.*;
import java.util.*;

public class Main {
	static final double EPS = 1e-10;
	static final double INF = 1L << 31;
	static final double PI = Math.PI;

	public static Scanner sc = new Scanner(in);
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void run() throws IOException {
		String input;
		input = br.readLine();
		String s = "CODEFESTIVAL2016";
		int c = 0;
		for (int i=0; i<input.length(); i++)
			if (input.charAt(i)!=s.charAt(i)) c++;
		sb.append(c);
		ln(sb);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public static void ln(Object obj) {
		out.println(obj);
	}
}
