
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int count = 0;
		
		int xnMax = 0, ymMin = 999;

		for (int i = 0; i < N; i++) {

			int xn = sc.nextInt();
			xnMax = Math.max(xnMax, xn);
		}
		for (int i = 0; i < M; i++) {
			int ym = sc.nextInt();
			ymMin = Math.min(ymMin, ym);
		}

		for (int i = X+1; i <= Y; i++) {
			if(xnMax < i && ymMin >= i) {
			++count;
			}
		}
		if(count == 0) {
			System.out.println("War");
		}else {
			System.out.println("No War");
		}

	}

}

