import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();

		int cnt = 0;
	
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == 'E') {
				cnt++;
			}
		}
		int num = cnt;

		for (int i = 1; i < n; i++) {
			int tmp = 0;
			if (s.charAt(i - 1) == 'W') {
				tmp++;
			}
			if (s.charAt(i) == 'E') {
				tmp--;
			}
			num = num + tmp;
			cnt = Math.min(cnt, num);
			// System.out.println(num+" "+cnt);
		}

		System.out.println(cnt);
		sc.close();
	}

}