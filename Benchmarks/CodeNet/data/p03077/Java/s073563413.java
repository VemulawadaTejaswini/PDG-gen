import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long[] A = new long[5];
		long ans = 4;
		for(int i = 0; i < 5; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		ans += N / A[0];
		if(N % A[0] != 0)
			ans += 1;
		System.out.println(ans);

	}

}
