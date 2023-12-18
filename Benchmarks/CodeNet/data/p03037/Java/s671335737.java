
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int min = 1;
		int max = N;
		int ans = 0;
		for(int i = 0; i < M; i++) {
			min = Math.max(min, sc.nextInt());
			max = Math.min(max, sc.nextInt());
			if(max - min >= 0) {
				ans = max - min + 1;
			}
		}
		System.out.println(ans);
	}

}
