import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		if (N > 999) {
			int n = N - 1000;
			String str = String.format("%03d", n);
			System.out.println("ABD" + str);
		} else {
			String str = String.format("%03d", N);
			System.out.println("ABC" + str);
		}
		
	}

}
