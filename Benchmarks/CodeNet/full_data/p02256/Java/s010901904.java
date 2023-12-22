import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArray = br.readLine().split(" ");
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);
		System.out.println(getGCD(a, b));

	}

	public static int getGCD(int a, int b) {
		if (a == b) return a;
		else if (a < b) {
			return getGCD(a, b - a);
		}
		else return getGCD(a - b, a);
	}
}