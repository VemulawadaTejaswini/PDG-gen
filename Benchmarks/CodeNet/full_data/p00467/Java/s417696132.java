import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			int[] map = new int[n];
			int[] th = new int[m];
			for(int i=0;i<n;i++) map[i] = sc.nextInt();
			for(int i=0;i<m;i++) th[i] = sc.nextInt();

			int now = 0;
			int idx = 0;
			int ans = 0;
			while(now < n - 1){
				ans++;
				now += th[idx++];
				if(now >= n - 1) break;
				now += map[now];
				if(now < 0) now = 0;
			}

			System.out.println(ans);
		}
	}
}