import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();

		int already = 0;
		int students_rank = 0;

		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			if (c == 'a') {
				if (already < A + B) {
					already++;
//					students_rank++;
					System.out.println("Yes");
				} else {
//					students_rank++;
					System.out.println("No");
				}
			} else if (c == 'b') {
				students_rank++;
				if (students_rank <= B && already < A + B) {
					already++;
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}else{
				System.out.println("No");
			}
		}

	}

}
