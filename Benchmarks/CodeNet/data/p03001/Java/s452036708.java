import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;

		double ans = (double)W*H/2;
		if(W == 2*x && H == 2*y) {
			count = 1;
		}
		System.out.println(ans +" "+count);
	}
}