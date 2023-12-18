import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = N;
		int sum = 0;
		while (X != 0) {
			sum += X % 10;
			X /= 10;
		}
		if (N % sum == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}