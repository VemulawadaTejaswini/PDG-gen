import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int N = Integer.parseInt(str[0]);
		int A = Integer.parseInt(str[1]);
		int B = Integer.parseInt(str[2]);

		if (N * A <= B) {
			System.out.println(N*A);
		}
		else {
			System.out.println(B);
		}
	}
}
