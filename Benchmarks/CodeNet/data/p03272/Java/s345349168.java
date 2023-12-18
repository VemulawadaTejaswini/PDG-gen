import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int N = 0,i = 0;

		N = sc.nextInt();
		i = sc.nextInt();

		System.out.println(N - i + 1);
	}
}
