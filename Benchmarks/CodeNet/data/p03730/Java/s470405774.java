import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		boolean b = false;

		for(int i = 0; i < A*B; i++) {
			if (A * i % B == C) {
				b = true;
				break;
			}
		}

		if (b == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
