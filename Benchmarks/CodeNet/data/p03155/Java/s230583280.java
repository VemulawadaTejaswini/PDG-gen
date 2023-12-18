import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();

		int result = ((N-H)+1)*((N-W)+1);

		System.out.println(result);
	}
}