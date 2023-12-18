import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int N = scan.nextInt();
		final int K = scan.nextInt();
		int result = 0;
		int h = 0;
		for(int i = 0; i < N; i++) {
			h = scan.nextInt();
			if(h >= K) {
				result++;
			}
		}
		System.out.println(result);
		scan.close();


	}

}
