
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int c = 0, t = 0;
		int min = 9999;
		for (int i = 0; i < N; i++) {
			c = sc.nextInt();
			t = sc.nextInt();
			if (t <= T) {
				min = Math.min(min, c);
			}
			
		}
		if(min == 9999) {
			System.out.println("TLE");
		}else {
			System.out.println(min);
		}
	}
}
