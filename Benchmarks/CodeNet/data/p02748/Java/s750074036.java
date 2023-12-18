
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int []aa = new int [a];
		int []bb = new int [b];
		
		int [][]sum = new int [a][b];
		int mina = 1000000000;
		int minb = 1000000000;
		
		for(int i = 0 ;i < a ;i++) {
			aa[i] = Integer.parseInt(sc.next());
			mina = Math.min(mina, aa[i]);
		}
		for(int i = 0 ;i < b ;i++) {
			bb[i] = Integer.parseInt(sc.next());
			minb = Math.min(minb, bb[i]);
		}
		
		int ans  = mina + minb;
				
		int [][]c = new int [a][b];
		
		for(int i = 0 ;i < m ;i++) {
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			int z = Integer.parseInt(sc.next());
			int temp = aa[x-1] +bb[y-1] - z;
			ans = Math.min(temp, ans);
		}
		
		System.out.println(ans);
		
		
		
		
	}

}
