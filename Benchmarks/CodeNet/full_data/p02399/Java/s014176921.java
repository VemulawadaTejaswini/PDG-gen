import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] arr = line.split(" ");
		long a = Long.parseLong(arr[0]);
		long b = Long.parseLong(arr[1]);
		System.out.printf("%d %d %g%n", a / b, a % b, (double) a / b);
	}
}