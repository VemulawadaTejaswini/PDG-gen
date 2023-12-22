import java.io.*;
import java.util.StringTokenizer;

class Main {
	private static final double e = 3.305785;

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			System.out.println(a*b/e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}