import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();

		String a[] = new String[N];
		String b[] = new String[N];
		String c[] = new String[N];

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			a[i] = A.substring(i, i+1);
			b[i] = B.substring(i, i+1);
			c[i] = C.substring(i, i+1);

			if (a[i].equals(b[i]) && b[i].equals(c[i])) {
				cnt += 0;
			} else if (a[i].equals(b[i]) || b[i].equals(c[i]) || c[i].equals(a[i])) {
				cnt += 1;
			} else {
				cnt += 2;
			}
		}
		System.out.println(cnt);
	}
}
