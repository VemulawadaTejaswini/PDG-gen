import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		int passed = 0;
		int passedFore = 1;
		for(int i = 0 ; i < n ; i++) {
			if(S.charAt(i) == 'a') {
				if(passed < A + B) {
					passed++;
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else if(S.charAt(i) == 'b') {
				if(passed < A + B && passedFore <= B) {
					passedFore++;
					passed++;
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		}
	}
}
