import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] c = new int[n+1];
		for(int i=0;i<n+1;i++) {
			c[i] = -1;
		}
		int s1,s2;
		for(int i=0; i<m;i++) {
			s1 = sc.nextInt();
			if(s1 > n) {
				System.out.println("-1");
				return;
			}
			s2 = sc.nextInt();
			if(c[s1]==-1) {
				c[s1] = s2;
				continue;
			}
			if(c[s1] == s2) {
				continue;
			}
			System.out.println("-1");
			return;
		}
		

		if(c[1] == 0) {
			if(n==0) {
				System.out.println("0");
				return;
			}
			System.out.println("-1");
			return;
		}
		
		int ans = 0;
		for(int i=1;i<n+1;i++) {
			if(c[i]==-1) {
				if(i==1) {
					ans += 1 * Math.pow(10, n-i);
				}
			}else {
				ans += c[i] * Math.pow(10, n-i);
			}
			
		}
		
		System.out.println(ans);
	}

}
