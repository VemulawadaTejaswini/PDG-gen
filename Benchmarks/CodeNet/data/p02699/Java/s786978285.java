import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int S = Integer.parseInt(str1);
		int W = Integer.parseInt(str2);

		if (W >= S) {
			System.out.println("unsafe");
		} else {
			System.out.println("safe");
		}
	}
}