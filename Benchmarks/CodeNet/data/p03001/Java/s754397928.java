import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;

		int a = Math.min(x, W-x);
		int b = Math.min(y, H-y);

		int ans = Math.max(a*H, b*W);

		if(a*H==b*W) {
			count = 1;
		}
		System.out.println(ans +" "+count);
	}
}