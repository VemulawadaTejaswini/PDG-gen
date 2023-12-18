import java.util.*;
import java.math.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		r = Math.min(r,l+4038);
		int ans = 2018;
		for (int i = l;i <= r; i++) {
			for (int j = i+1;j <= r; j++) {
				int x = i*j%2019;
				ans = Math.min(ans,x);
			}
		}
		System.out.println(ans);
	}
}