import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String[] R = new String[N];
		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}

		for (int i = 0; i < N; i++) {
			String s = S[i];
			if (s.equals("AB")) {
				if (A == B && A == 1 && i != N - 1 && !s.equals(S[i + 1])) {
					if (S[i + 1].contains("A")) {
						A++;
						B--;
						R[i] = "A";
					} else {
						A--;
						B++;
						R[i] = "B";
					}
				} else if (A > B) {
					A--;
					B++;
					R[i] = "B";
				} else {
					A++;
					B--;
					R[i] = "A";
				}
			} else if (s.equals("BC")) {
				if (B == C && B == 1 && i != N - 1 && !s.equals(S[i + 1])) {
					if (S[i + 1].contains("B")) {
						B++;
						C--;
						R[i] = "B";
					} else {
						B--;
						C++;
						R[i] = "C";
					}
				} else if (B > C) {
					B--;
					C++;
					R[i] = "C";
				} else {
					B++;
					C--;
					R[i] = "B";
				}
			} else {
				if (C == A && C == 1 && i != N - 1 && !s.equals(S[i + 1])) {
					if (S[i + 1].contains("C")) {
						C++;
						A--;
						R[i] = "C";
					} else {
						C--;
						A++;
						R[i] = "A";
					}
				} else if (C > A) {
					C--;
					A++;
					R[i] = "A";
				} else {
					C++;
					A--;
					R[i] = "C";
				}
			}
			if (A < 0 || B < 0 || C < 0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		for (int i = 0; i < N; i++) {
			System.out.println(R[i]);
		}
	}

}