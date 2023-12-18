import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long L = sc.nextLong();
		long R = sc.nextLong();

		long ans = 2018;

		R = Math.min(R, L + 2019);

		for (long i=L; i<=R; i++) {
			for (long j=i+1; j<=R; j++){
				ans = Math.min(ans, (i*j)% 2019);
			}
		}

		System.out.println(ans);
	}


}