import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		String[] inputS = new String[2];
		Integer n, k = 0;
		String ans = "No";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			inputS = br.readLine().split(" ");
			n = Integer.valueOf(inputS[0]);
			k = Integer.valueOf(inputS[1]);
		}
//		if (n % 2 != 0) {
//			n += 1;
//		}
//		if((n / 2) >= k) {
//			ans = "Yes";
//		}
		System.out.println(ans);
	}
}