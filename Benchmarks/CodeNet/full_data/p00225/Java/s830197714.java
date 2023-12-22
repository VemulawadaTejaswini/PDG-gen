import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String dict[];
		int mark[];
		int ini;
		int next;
		boolean f;
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			f = true;
			dict = new String[n];
			mark = new int[n];
			for (int i = 0; i < n; i++) {
				dict[i] = sc.next();
			}
			Arrays.sort(dict);
			
			ini = dict[0].charAt(0);
			mark[0] = 1;
			next = dict[0].charAt(dict[0].length() - 1);
			for (int i = 0; i < n - 1; i++) {
				f = false;
				for (int j = 0; j < n; j++) {
					if (dict[j].charAt(0) == next && mark[j] == 0) {
						mark[j] = 1;
						next = dict[j].charAt(dict[j].length() - 1);
						f = true;
						break;
					}
				}
				if (!f) {
					break;
				}
			}
			if (f && next == ini) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}
}