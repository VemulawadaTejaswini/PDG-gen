import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;

		int ans = W*H/2;
		if(x == W/2 && y == H/2) {
			count = 1;
		}

		System.out.println(ans +" "+count);
	}
}