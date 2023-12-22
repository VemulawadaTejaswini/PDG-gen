import java.util.*;

public class Main {
	static final int r = 1000000000 + 7;
	public static long pow(int a, int b) {
		long ans = 1;
		for(int i = 0; i < b; ++i){
			ans *= a;
			ans %= r;
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ans = 0;
		if(n > 1){
			long tmp = pow(8, n);
			tmp %= r;
			tmp += pow(10, n);
			tmp %= r;
			long tmp2 = pow(9, n);
			tmp -= tmp2;
			tmp %= r;
			tmp -= tmp2;
			tmp %= r;
			ans = (int)tmp;
		}
		System.out.println(ans);
	}
}
