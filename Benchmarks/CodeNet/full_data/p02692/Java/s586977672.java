import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String[] s = new String[N+1];
		for(int i = 0; i < N; i++)
			s[i] = sc.next();
		s[N] = "";
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < N; i++) {
			if(s[i].equals("AB")) {
				if(A <= 0 && B <= 0) {
					System.out.println("No");
					return;
				}
				if(A < B) {
					ans.append("A\n");
					A++;
					B--;
				}
				else if(B > A) {
					ans.append("B\n");
					B++;
					A--;
				}
				else {
					if(s[i+1].equals("BC")) {
						ans.append("B\n");
						B++;
						A--;
					}
					else {
						ans.append("A\n");
						A++;
						B--;
					}
				}
			}
			else if(s[i].equals("AC")) {
				if(A <= 0 && C <= 0) {
					System.out.println("No");
					return;
				}
				if(A < C) {
					ans.append("A\n");
					A++;
					C--;
				}
				else if(C > A) {
					ans.append("C\n");
					C++;
					A--;
				}
				else {
					if(s[i+1].equals("AB")) {
						ans.append("A\n");
						A++;
						C--;
					}
					else {
						ans.append("C\n");
						C++;
						A--;
					}
				}
			}
			else {
				if(B <= 0 && C <= 0) {
					System.out.println("No");
					return;
				}
				if(B < C) {
					ans.append("B\n");
					B++;
					C--;
				}
				else if(B > C) {
					ans.append("C\n");
					C++;
					B--;
				}
				else {
					if(s[i+1].equals("AC")) {
						ans.append("C\n");
						C++;
						B--;
					}
					else {
						ans.append("B\n");
						B++;
						C--;
					}
				}
			}
		}
		System.out.println("Yes");
		System.out.println(ans);
	}

}
