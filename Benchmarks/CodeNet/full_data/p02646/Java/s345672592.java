import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int v = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");

		int b = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);

		int t = Integer.parseInt(br.readLine());

		int acr = v - w;

		if (acr <= 0) {
			System.out.println("No");
		} else {
			if (acr * t >= Math.abs(a - b)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
