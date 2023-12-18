import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char c[] = S.toCharArray();
		int count = 0;
		int r = 0;
		int l = 0;
		int p1 = 0;
		int p2 = N - 1;
		while (true) {
			if (c[p1] == 'W' && c[p2] == 'E') {
				count += 2;
				r++;
				l++;
				p1++;
				p2--;
			} else if (c[p1] == 'E' && c[p2] == 'W') {
				p1++;
				p2--;
			} else if (c[p1] == 'W' && c[p2] == 'W') {
				count++;
				l++;
				p1++;
			} else if (c[p1] == 'E' && c[p2] == 'E') {
				count++;
				r++;
				p2--;
			}
			if (p2 - p1 <= 1) {
				break;
			}
		}
		if (l > r && count > r) {
			System.out.println(r);
		} else if (r > l && count > l) {
			System.out.println(l);
		} else {
			System.out.println(count);
		}
	}
}