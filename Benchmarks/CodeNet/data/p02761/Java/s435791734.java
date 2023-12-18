
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		boolean []b = new boolean [n];
		int m = Integer.parseInt(sc.next());
		
		boolean flag = true;
		for(int i = 0;i < m;i++) {
			int s = Integer.parseInt(sc.next());
			int t = Integer.parseInt(sc.next());
			if(!b[n-s]) {
				if(s == 1 && t == 0) {
					flag = false;
					break;
				}
				a[n-s] = t; 
				b[n-s] = true;
			}
			else {
				if(a[n-s] != t) {
					flag = false;
					break;
				}
			}
			
		}
		
		if(flag) {
			int ans= 0;
			
			for(int i = 0 ; i < n ;i++) {
				if(i == n-1 && !b[i]) {
				ans += Math.pow(10, i);
				} 
				else {
				ans += a[i] * Math.pow(10, i);
			}
		}
			System.out.println(ans);
		}
		else {
			System.out.println(-1);
		}
	}

}
