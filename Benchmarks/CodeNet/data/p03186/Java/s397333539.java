import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	static Integer n;
	public static void main(String[] args) throws IOException {
		String[] inputS = new String[3];
		Integer a, b, c, n, ans = 0;
		boolean poisoned = false;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			inputS = br.readLine().split(" ");
			a = Integer.valueOf(inputS[0]);
			b = Integer.valueOf(inputS[1]);
			c = Integer.valueOf(inputS[2]);
			n = a + b + c;
		}
		for(int i=0;i<n;i++) {
			if(!poisoned && c > 0) {
				c--;
				ans++;
				poisoned = true;
			} else if(b > 0) {
				b--;
				ans++;
				poisoned = false;
			} else if(a > 0) {
				a--;
				poisoned = false;
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}