import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.valueOf(scan.nextLine()).intValue();
		String[] colors = new String[n];
		for (int i = 0; i < n; i++) {
			colors[i] = scan.next();
		}

		int cnt = 1;
		for (int i = 0; i < n; i++) {
			String baseColor = colors[i];
			for (int j = i + 2; j < n; j++) {
				if (baseColor.equals(colors[j])) {
					cnt++;
				}
			}
		}

		System.out.println(cnt % (10 * 9 + 7));
	}
}
