import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		sc.close();
		long ans = 1;
		for(int i = 0; i < 3; ++i) {
			ans *= (n / k);
		}
		if(k % 2 == 0) {
			long tmp = 1;
			for(int i = 0; i < 3; ++i) {
				tmp *= ((n - k / 2) / k + 1);
			}
			ans += tmp;
		}
		System.out.println(ans);
	}

}
