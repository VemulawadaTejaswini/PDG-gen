import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		
		if (K % 2 == 0) {
			int tmp = N / K;
			long ans = 0;
			ans += convi(tmp);
			tmp = N / (K / 2);
			tmp = tmp / 2 + tmp % 2;
			ans += convi(tmp);
			System.out.println(ans);
		} else {
			int tmp = N / K;
			System.out.println(convi(tmp));
		}
	}
	
	static long convi(long yaku) {
		long ans = 0;
		if (yaku == 1) {
			ans = 1;
		} else {
			ans = (long) (Math.pow(yaku, 3));
		}
		
		return ans;
	}
}
