import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int ans;
		if(Math.abs(a - b) <= W) {
			ans = 0;
		} else if(a < b) {
			ans = b - (a + W);
		} else {
			ans = a - (b + W);
		}
		System.out.println(ans);
	}
}
