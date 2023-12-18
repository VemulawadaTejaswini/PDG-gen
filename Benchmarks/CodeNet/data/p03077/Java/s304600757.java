import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long ans = 4;
		for(int i = 0; i < 4; i++)
			A = Math.min(A, sc.nextLong());
		ans += N / A;
		if(N % A != 0)
			ans += 1;
		System.out.println(ans);

	}

}