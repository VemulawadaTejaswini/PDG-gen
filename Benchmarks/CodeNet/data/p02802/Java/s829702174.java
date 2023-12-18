
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[m];
		String[] s = new String[m];
		
		for (int i = 0; i < m; i++) {
			num[i] = sc.nextInt();
			s[i] = sc.next();
		}
		
		boolean[] b = new boolean[n];
		int ac = 0;
		int wa = 0;
		for (int i = 0; i < m; i++) {
			if (s[i].equals("AC") && !b[num[i] - 1]) {
				b[num[i] - 1] = true;
				ac++;
				continue;
			}
			
			if (s[i].equals("WA") && !b[num[i] - 1]) {
				wa++;
			}
		}
		
		System.out.println(ac + " " + wa);

	}
}