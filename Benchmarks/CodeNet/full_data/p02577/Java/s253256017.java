import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] n = in.readLine().split("");
		int sum = 0;
		for (String c : n) {
			sum += Integer.parseInt(c);
		}
		if (sum%9 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
