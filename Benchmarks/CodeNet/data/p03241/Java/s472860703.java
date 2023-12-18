import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int ans = 0;
		for(int i=1;i<=n;i++) {
			if(m%i==0 && m/i>=n) {
				ans = i;
			}
		}
		if(m%n==0) {
			ans = Math.max(ans, m/n);
		}
		System.out.println(ans);
		

	}

}
