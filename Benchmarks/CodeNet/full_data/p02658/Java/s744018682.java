import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long ans = 1;
		long a[];
		a = new long[N];
		for(int i = 0 ; i < N ; i++) {
			a[i] = scn.nextLong();
		}
		scn.close();
		for(int i = 0 ; i < N ; i++) {
			ans *= a[i];
		}
		if(ans > Math.pow(10, 18)) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}
}
