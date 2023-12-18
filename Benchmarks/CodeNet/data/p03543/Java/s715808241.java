import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] N = sc.nextLine().toCharArray();
		sc.close();
		boolean isYes = false;
		if (N[0] != N[1]) {
			if (N[1] == N[2] && N[2] == N[3]) {
				isYes = true;
			}
		} else if (N[3] != N[2]) {
			if (N[2] == N[1] && N[1] == N[0]) {
				isYes = true;
			}
		} else if (N[2] == N[1] && N[1] == N[0] && N[2] == N[3]) {
			isYes = true;
		}
		
		if (!isYes) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}