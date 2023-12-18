import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int n = N/10;
		N += n;

		System.out.println((int)Math.pow(100, D)*N);

	}

}
