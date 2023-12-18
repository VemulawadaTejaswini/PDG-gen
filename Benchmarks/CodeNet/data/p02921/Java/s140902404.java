

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String[] S = sc.next().split("");
		String[] T = sc.next().split("");

		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			if (S[i].equals(T[i])) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}