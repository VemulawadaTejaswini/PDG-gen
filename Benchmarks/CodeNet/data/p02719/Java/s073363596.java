import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		long N = scan.nextLong();
		long K = scan.nextLong();

		long rest = N % K;

		System.out.println(rest > K - rest ? K - rest : rest);
	}
}