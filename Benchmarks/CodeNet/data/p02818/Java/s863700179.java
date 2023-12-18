import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ",0);
		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		long k = Long.parseLong(str[2]);
		sc.close();
		Main main = new Main();
		long[] ans_arr = new long[2];
		ans_arr = main.solve(a, b, k);
		System.out.println(ans_arr[0] +" "+ans_arr[1]);
	}

	public long[] solve(long a,long b,long k) {
		long[] ans = new long[2];
		if(k == 0) {
			ans[0] = a;
			ans[1] = b;
			return ans;
		}
		if (a >= k) {
			ans[0] = a - k;
			ans[1] = b;
			return ans;
		}else {
			ans[0] = 0;
			k = k - a;
			if (b >=k) {
				ans[1] = b-k;
				return ans;
			} else {
				ans[1] = 0;
				return ans;
			}
		}

	}
}