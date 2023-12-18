import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int sum = 0;
		for(int i=0; i<M; i++) {
			sum += sc.nextInt();
		}

		int ans = N - sum;

		if(ans < 0)
			ans = -1;

		System.out.println(ans);

	}

}
