import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long k = in.nextLong();
		int[] take = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			take[i] = in.nextInt();
		}
		int[] check = new int[n + 1];
		int cnt = 1;
		int cur = 1;
		boolean flag = false;
		while(check[cur] == 0) {
			if(cnt == k) {
				flag = true;
				break;
			}
			if(check[take[cur]] != 0) {
				cnt += 1;
				break;
			}
			check[cur] = cnt;
			cnt += 1;
			cur = take[cur];
		}
		if(flag == true) {
			System.out.println(cur);
		}else {
			long ride = cnt - check[cur];
			cur = take[cur];
			long make = k - cnt + 1;
			long newmake = make % ride;
			while(newmake > 0) {
				cur = take[cur];
				newmake -= 1;
			}
			System.out.println(cur);
		}
	}
} 
