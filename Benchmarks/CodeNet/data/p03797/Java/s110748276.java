import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ");
		int s = Integer.parseInt(num[0]);
		int c = Integer.parseInt(num[1]);
		if (2 * s >= c)
			System.out.println(s);
		else {
			int k = (int) Math.floor((c - 2 * s) / 4);
			System.out.println(s + k);
		}

	}
}
