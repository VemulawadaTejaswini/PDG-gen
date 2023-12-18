import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		if (N==1) {
			System.out.println(A/B-A*(1/B));
			return ;
		}
		if (N>=B) {
			System.out.println(A*(N-1)/B-A*((N-1)/B));
		} else {
			System.out.println(A*N/B-A*(N/B));
		}
	}
}