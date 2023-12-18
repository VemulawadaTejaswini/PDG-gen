import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s[] = new String[n];
		long m = 0;
		long a = 0;
		long r = 0;
		long c = 0;
		long h = 0;
		for (int i = 0; i < n; i++) {
			s[i] = scan.next();
			char head = s[i].charAt(0);
			if (head == 'M') {
				m++;
			} else if (head == 'A') {
				a++;
			} else if (head == 'R') {
				r++;
			} else if (head == 'C') {
				c++;
			} else if (head == 'H') {
				h++;
			}
		}
		long sum = m*a*r + m*a*c + m*a*h + m*r*c + m*r*h + m*c*h + a*r*c + a*r*h + a*c*h + r*c*h;
		System.out.println(sum);
	}
}