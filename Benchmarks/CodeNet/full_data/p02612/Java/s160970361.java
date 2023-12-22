import java.util.Scanner;

// ABC173-A
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int n = N / 1000;
		int result = 1000 * (n + 1) - N;

		System.out.println(result);
		sc.close();
	}

}
