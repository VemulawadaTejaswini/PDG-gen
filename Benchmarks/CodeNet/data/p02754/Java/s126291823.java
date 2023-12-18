import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = A+B;
		long count = 0L;
		long ans = 0L;

		ans += (N % C) * A;
		if (N - (C*(N%C)) >= A) 
			ans += A;
		else 
			ans += N -(C*(N%C));

		System.out.println(ans);
	}
}