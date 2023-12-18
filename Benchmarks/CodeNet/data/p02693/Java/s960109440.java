import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long N = sc.nextInt();
		long x;
		long score;
		long res = 0;
		for(long i = 1; i <= N; i++) {
			x = i;
			score = (A*x)/B - A*(x/B);
			res = Math.max(res, score);
		}
		System.out.println(res);
	}
}