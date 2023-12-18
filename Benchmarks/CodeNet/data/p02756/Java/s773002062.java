import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String S;
		int Q;
		int T;
		int F;
		String J;
		int i;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		Q = sc.nextInt();
		for (i = 0; i < Q; i++) {
			T = sc.nextInt();
			if (T == 1) {
				StringBuffer str = new StringBuffer(S);
				S = str.reverse().toString();
			}
			if (T == 2) {
				F = sc.nextInt();
				J = sc.next();
				StringBuffer str = new StringBuffer(S);
				if (F == 1) {
					str.insert(0, J);
					S = str.toString();
				}
				if (F == 2) {
					str.insert(S.length(), J);
					S = str.toString();
				}
			}
		}
		System.out.println(S);
		sc.close();
	}
}