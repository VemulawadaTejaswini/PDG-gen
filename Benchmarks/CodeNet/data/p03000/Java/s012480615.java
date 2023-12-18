import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < l.length; i++) {
			l[i] = sc.nextInt();
		}
		sc.close();

		int cnt = 1;
		int d = 0;
		for (int i = 0; i < l.length; i++) {
			d += l[i];
			if (d <= x) {
				cnt++;
			} else {
				break;
			}
		}
		System.out.println(cnt);
	}
}
