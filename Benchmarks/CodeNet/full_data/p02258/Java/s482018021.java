import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long ans = -10000000000L;
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		long minv = stdin.nextLong();	long tmp;
		for(int i = 1; i < n; i++) {
			tmp = stdin.nextLong();
			ans = Long.max(ans,tmp - minv);
			minv = Long.min(minv, tmp);
		}
		stdin.close();
		System.out.println(ans);
	}
}
