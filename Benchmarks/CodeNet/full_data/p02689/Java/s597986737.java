import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());		
		int m =  Integer.parseInt(sc.next());		
		int[] h = new int[n];
		boolean[] low = new boolean[n];
		for(int i = 0 ; i < n; i++) {
			h[i] = Integer.parseInt(sc.next());
		}

		for(int i = 0 ; i < m; i++) {
			int a =  Integer.parseInt(sc.next())-1;
			int b =  Integer.parseInt(sc.next())-1;

			if(h[a] == h[b]) {
				low[a] = true;
				low[b] = true;
			}else if(h[a] > h[b]) {
				low[b] = true;
			}else{
				low[a] = true;
			}
		}

		int ans = 0;
		for(int i = 0 ; i < n ; i++) {
			if(!low[i]) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
