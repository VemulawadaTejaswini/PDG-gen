
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
		String[] inputArray;
		input = br.readLine();
		inputArray = input.split(" ");

		int n = Integer.valueOf(inputArray[0]);
		int A = Integer.valueOf(inputArray[1]);
		int B = Integer.valueOf(inputArray[2]);
		int a=0, b=0;
		input = br.readLine();
		for (int i=0; i<n; i++){
			switch (input.charAt(i)){
				case 'a': {
					if (a+b<A+B){
						a++;
						sb.append("Yes\n");
					} else{
						sb.append("No\n");
					}
					break;
				}
				case 'b': {
					if (a+b<A+B && b<B){
						b++;
						sb.append("Yes\n");
					} else{
						sb.append("No\n");
					}
					break;
				}
				case 'c': {
					sb.append("No\n");
					break;
				}
			}
				
		}
		ln(sb);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public static void ln(Object obj) {
		out.print(obj);
	}
}
