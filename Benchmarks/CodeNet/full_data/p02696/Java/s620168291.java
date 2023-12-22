import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		long B = sc.nextLong();
		long N = sc.nextLong();

		long x = 1;
		if(B >= 2) {
			x = Math.min(B-1, N);
		}

		long ans = (long)Math.floor((double)A*x/B) - A * (long)Math.floor((double)x/B);

		System.out.println(ans);

	}


}
