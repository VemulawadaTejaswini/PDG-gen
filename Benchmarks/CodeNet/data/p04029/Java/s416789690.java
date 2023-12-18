import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt(); //人数
		int total = 0; //必要なキャンディの個数

		for (int i = 1; i <= N; i++) {
			total += i ;
		}
		System.out.println(total);
	}
}