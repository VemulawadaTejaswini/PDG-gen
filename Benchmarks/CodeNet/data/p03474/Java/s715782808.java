import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		
		int countA = 0;
		int countB = 0;
		int count_ = 0;
		
		for(int i = 0; i < A; i++) {
			if(S.substring(i, i + 1).matches("[0-9]")) {
				countA++;
			}
		}
		for(int i = A + 1; i < A + B + 1; i++) {
			if(S.substring(i, i + 1).matches("[0-9]")) {
				countB++;
			}
		}
		if(S.charAt(A) == '-') {
			count_++;
		}
		if(countA == A && countB == B && count_ == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
