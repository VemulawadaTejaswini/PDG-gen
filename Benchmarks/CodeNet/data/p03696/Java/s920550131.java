import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char ch[] = S.toCharArray();
		int fl = N;
		int lr = -1;
		int addl = 0;
		int addr = 0;
		for (int i = 0; i < N; i++) {
			if (ch[i] == '(') {
				fl = i;
				break;
			}
		}
		for (int i = N - 1; i >= 0; i--) {
			if (ch[i] == ')') {
				lr = i;
				break;
			}
		}
		int c = 0;
		addl = fl;
		addr = N-1-lr;
		if (fl < lr) {
			for (int i = fl; i <= lr; i++) {
				if (ch[i] == '(') {
					c++;
				} else if (c == 0) {
					addl++;
				} else {
					c--;
				}
			}
			addr += c;
		}
		for (int i = 0; i < addl; i++) {
			System.out.print("(");
		}
		System.out.print(S);
		for (int i = 0; i < addr; i++) {
			System.out.print(")");
		}
		System.out.println();
	}
}
