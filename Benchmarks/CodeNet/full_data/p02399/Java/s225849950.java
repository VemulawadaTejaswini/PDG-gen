import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		String[] strArray = br.readLine().split(" ");
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);

		int d = a/b;
		int r = a%b;
		double f = (double)a/(double)b;

		System.out.printf("%d %d %05f", d, r, f);
	}
}