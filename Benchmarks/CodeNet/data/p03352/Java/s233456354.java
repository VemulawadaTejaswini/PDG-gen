import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int ans = 0;

		for(int b = 1; b <= X; b++) {
			for(int q = 2; q <= 1000; q++) {
				if(Math.pow(b, q) <= X) {
					ans = (Math.max((int)Math.pow(b,  q), ans));
				}
			}
		}
		System.out.println(ans);
	}
}
