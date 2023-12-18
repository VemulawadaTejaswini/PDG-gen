import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		for(int i=1; i<=A; i++) {
			if((N%500)%i==0) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");

	}

}