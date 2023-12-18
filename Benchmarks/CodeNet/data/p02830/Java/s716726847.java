import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < N; i++) {
			s.append(S.charAt(i));
			s.append(T.charAt(i));
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}