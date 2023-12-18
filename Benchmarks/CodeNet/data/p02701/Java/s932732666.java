import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = new String[N];

		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}

		int cnt = N;
		for (int i = 0; i < N; i++) {
			String s = S[i];
			for (int j = i+1; j < N; j++) {
				if (s.equals(S[j])) {
					cnt--;
					break;
				}
				
			}
		}
		System.out.println(cnt);
	}
}
