import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		while(true) {
			int N = sc.nextInt();
			if(N == 0) break;
			int ans = 0;
			while(true) {
				ans += (N /= 5);
				if(N < 5) break;
			}
			System.out.println(ans);
		}
	}
}