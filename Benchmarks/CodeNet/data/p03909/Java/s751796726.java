
import static java.lang.System.in;
import static java.lang.System.out;

import java.io.*;
import java.util.*;

public class Main {
	static final double EPS = 1e-10;
	static final double INF = 1L << 31;
	static final double PI = Math.PI;

	public static Scanner sc = new Scanner(in);
	static StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void run() throws IOException {
		String input;
		String[] inputArray;
		input = br.readLine();
		inputArray = input.split(" ");
		int h = Integer.valueOf(inputArray[0]);
		int w = Integer.valueOf(inputArray[1]);
		for (int i=0; i<h; i++){
			input = br.readLine();
			inputArray = input.split(" ");
			for (int j=0; j<w; j++){
				if (inputArray[j].equals("snuke")){
					sb.append((char)('A'+j));
					sb.append((i+1));
					return;
				}
			}
		};
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
		ln(sb);
	}
	public static void ln(Object obj) {
		out.println(obj);
	}
}
