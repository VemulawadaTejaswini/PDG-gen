import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] str = line.split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int count = 0;
		if (a == b && b == c) {
			System.out.print("-1");
		} else {
			while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
				count++;
				int a2 = (b + c) / 2;
				int b2 = (a + c) / 2;
				int c2 = (b + a) / 2;
				a = a2;
				b = b2;
				c = c2;
			}
			System.out.println(count);
		}
	}
}
