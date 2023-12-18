import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		long mod = 1000000007;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i <= N; i++) {
			boolean flag = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				list.add(i);
			}
		}

		int[]p = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			int k = list.get(i);
			for(int j = 2; j <= N; j++) {
				int t = j;
				while(t % k == 0) {
					t /= k;
					p[i]++;
				}
			}
		}
		long cnt = 1;
		for(int i : p) {
			cnt *= (i + 1);
			cnt %= mod;
		}
		System.out.println(cnt);
	}
}