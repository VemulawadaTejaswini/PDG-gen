import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		for (int i=1;i<1000;i++) {
			if ((A*i)%B==C) {
				System.out.println("Yes");
				return ;
			}
		}
		System.out.println("No");
	}
}
