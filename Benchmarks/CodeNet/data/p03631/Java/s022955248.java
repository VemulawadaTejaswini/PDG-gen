import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int a = N / 100;
		int b = (N % 100) / 10;
		int c = (N % 100) % 10;
		int check = 100 * c + 10 * b + a;
		if(N == check) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}