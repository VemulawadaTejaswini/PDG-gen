import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		int sum = 0;

		for(int i = 0; i < N.length(); i++) {
			sum = sum + Integer.parseInt(N.substring(i, i+1));
		}

		if((Integer.parseInt(N) % sum) == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}