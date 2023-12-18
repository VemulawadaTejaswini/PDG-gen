import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a[] = new int [100];
		int N = scan.nextInt();

		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}

		for(int i = 0; i < N; i++) {

			// 偶数だけど3でも5でも割り切れない
			if(a[i] % 2 == 0 && a[i] % 3 != 0 && a[i] % 5 != 0) {
				System.out.println("DENIED");
				return;
			}
		}

		System.out.println("APPROVED");


	}
}