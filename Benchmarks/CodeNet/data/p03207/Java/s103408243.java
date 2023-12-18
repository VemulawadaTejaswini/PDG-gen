import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int max = -1;
		int ans = 0;
		for(int i = 0;i < N;i++) {
			int p = scn.nextInt();
			ans += p;
			max = Math.max(p, max);
		}
		ans -= max/2;
		System.out.println(ans);
	}
}