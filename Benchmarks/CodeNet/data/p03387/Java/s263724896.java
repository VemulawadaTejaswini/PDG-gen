import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next().trim());
		int B = Integer.parseInt(sc.next().trim());
		int C = Integer.parseInt(sc.next().trim());
		int count = 0;
		
		while ( A != B || B != C || A != C ) {
			if (A > B && A > C) {
					B++;
					C++;
					count++;
			} else {
				if (A > B) {
					B+=2;
					count++;
				} else if (A > C) {
					C+=2;
					count++;
				}
			}
			
			if (B > A && B > C) {
				A++;
				C++;
				count++;
			} else {
				if (B > A) {
					A+=2;
					count++;
				} else if (B > C) {
					C+=2;
					count++;
				}
			}

			if (C > A && C > B) {
				A++;
				B++;
				count++;
			} else {
				if (C > A) {
					A+=2;
					count++;
				} else if (C > B) {
					B+=2;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}