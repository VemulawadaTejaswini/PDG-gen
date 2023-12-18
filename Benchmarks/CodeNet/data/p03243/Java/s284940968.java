import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int ans = 0;
		if(N % 111 == 0) {
			ans = N;
		}else {
			ans = (N / 111 + 1) * 111;
		}

		System.out.println(ans);

	}

}
