import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String a, b, c;
		while (true) {
			Scanner sc = new Scanner(System.in);
			String line = sc.next();
			if (line == "-") {
				break;
			} 
				c = line;
				int m = sc.nextInt();
				int[] h = new int[m];
				for (int i = 0; i < m; i++) {
					h[i] = sc.nextInt();
					a = c.substring(0, h[i]);
					b = c.substring(h[i]);
					c = b + a;
				}
				System.out.println(c);
			
		}
	}
}