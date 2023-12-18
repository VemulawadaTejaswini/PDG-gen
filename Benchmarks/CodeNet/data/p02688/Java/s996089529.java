import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());		
		int k =  Integer.parseInt(sc.next());		
		boolean[] have = new boolean[n];
		
		for(int i = 0 ; i < k ; i++) {
			int cnt = Integer.parseInt(sc.next());
			for(int j = 0; j < cnt ; j++) {
				have[Integer.parseInt(sc.next())-1] = true;
			}
		}
		
		int ans = 0;
		for(int i = 0 ; i < n ; i++) {
			if(!have[i]) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
	}
}

