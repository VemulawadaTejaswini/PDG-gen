import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int x;
		int score;
		int res = 0;
		for(int i = 1; i <= N; i++) {
			x = i;
			score = (A*x)/B - A*(x/B);
			res = Math.max(res, score);
		}
		System.out.println(res);
	}
}