import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = reader.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(String.format("%d %d", getGCD(a,b), getLCM(a,b)));
		}
		reader.close();
	}

	private int getGCD(int a, int b) {
		int ans = 1;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				if (b % (a / i) == 0) {
					ans = a / i;
					break;
				}
			}
		}
		return ans;
	}
	
	private int getLCM(int a, int b) {
		int ans = 0;
		int m = 1;
		while (true) {
			if (b * m % a == 0) {
				ans = b * m;
				break;
			}
			m++;
		}
		return ans;
	}
}
