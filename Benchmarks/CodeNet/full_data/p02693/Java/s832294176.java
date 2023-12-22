import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int K = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();

		if(A / K == B / K) {
			if(A % K == 0) {
				System.out.println("OK");
			}else {
				System.out.println("NG");
			}
		}else {
			System.out.println("OK");
		}

	}
}