import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		for(int i = 0; i < N; i++) {
				scan.nextInt();
		}
		scan.close();
		int t = 0;
		if((N - 1) % (K - 1) == 0) {
			t = (N - 1) / (K - 1);
			System.out.println(t);
		}else {
			t = (N - 1) / (K - 1) + 1;
			System.out.println(t);
		}

	}
}