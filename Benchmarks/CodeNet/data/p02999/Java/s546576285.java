import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int X = Integer.parseInt(str[0]);
		int A = Integer.parseInt(str[1]);
		if (X < A) {
			System.out.println(0);
		}
		else {
			System.out.println(10);
		}
	}
}
