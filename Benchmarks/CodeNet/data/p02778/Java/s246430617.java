import java.util.*;

class Main {
	Scanner sc;
	String S;
	
	private void calc() {
		sc = new Scanner(System.in);
		S = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < S.length(); i++) sb.append('x');
		System.out.println(sb);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
