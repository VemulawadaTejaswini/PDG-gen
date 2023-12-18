import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 何両？
		int N = sc.nextInt();

		// 前から何番目？
		int i = sc.nextInt();

		if(N == i) {
			System.out.println(i);
		} else {
			i--;
			System.out.println(N - i);
		}
	}
}