import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int I = sc.nextInt();

		System.out.println(N - I + 1);
		sc.close();
	}

}
