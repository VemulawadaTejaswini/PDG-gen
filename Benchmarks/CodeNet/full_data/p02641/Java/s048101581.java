import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		boolean[] r = new boolean[100];
		for(int i = 0; i < N; i++) {
			int p = sc.nextInt();
			r[p - 1] = true;
		}
		sc.close();
		int abs1 = 0;
		int abs2 = 0;
		for(int i = X; i < 100; i++) {
			if(!r[i]) {
				abs1 = i + 1;
				break;
			}
		}
		for(int i = X - 1; i >= 0; i--) {
			if(!r[i]) {
				abs2 = i + 1;
				break;
			}
		}
		// prtln(abs1 + " " + abs2);
		int answer = abs2;
		if(Math.abs(X - abs1) < Math.abs(X - abs2)) {
			answer = abs1;
		}
		prtln(answer);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
