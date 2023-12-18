import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = new String[N];
		int score = 0;

		for(int i = 0;i < N;i++) {
			S[i] = sc.next();
			if(S[i].equals("Y")) {
				score += 1;
			}
		}

		if(score == 0) {
			System.out.println("Three");
		}else {
			System.out.println("Four");
		}

	}

}
