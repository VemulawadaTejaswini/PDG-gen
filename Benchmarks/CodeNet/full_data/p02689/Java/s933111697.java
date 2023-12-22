import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		int[] h = new int[n];
		for (int i = 0;i < n; ++i){
			h[i] = Integer.parseInt(scan.next());
		}
		boolean[] good = new boolean[n];
		Arrays.fill(good, true);

		int a,b;
		for (int i = 0;i < m; ++i){
			a = Integer.parseInt(scan.next());
			b = Integer.parseInt(scan.next());
			if (h[a-1] > h[b-1]){
				good[b-1] = false;
			}else if(h[a-1] < h[b-1]) {
				good[a-1] = false;
			}else if (h[a-1] == h[b-1]){
				good[b-1] = false;
				good[a-1] = false;
			}
		}

		int ans = 0;
		for (boolean i:good){
			if (i)++ans;
		}
		System.out.print(ans);
	}
}

//end