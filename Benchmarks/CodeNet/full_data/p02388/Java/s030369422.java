import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		br.close();
		int x = Integer.parseInt(in);
		int y = cube(x);
		System.out.println(y);
	}
	/**
	 * x を3乗する
	 * 
	 * @param x
	 * @return
	 */
	public static int cube(int x) { 
		return x*x*x;
	}
}