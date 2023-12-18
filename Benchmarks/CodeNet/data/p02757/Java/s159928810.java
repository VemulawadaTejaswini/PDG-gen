

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = sc.nextInt();
		String s = sc.next();
	
		if (p==2 || p==5) {
			long ans = 0;
			for (int i=0;i<n;i++) {
				if ((s.charAt(i)-'0')%p==0) {
					ans+=(i+1);
				}
			}
			System.out.println(ans);
			
		} else {
			long[] count = new long[p];
			int rem = 0;
			count[0]=1;
			for (int i=n-1; i>=0; i--) {
				rem=(10*rem+s.charAt(i)-'0')%p;
				count[rem]++;
			}
			
			long ans = 0;
			for(int i=0;i<p;i++) {
				ans += count[i]*(count[i]-1)/2;
			}
			System.out.println(ans);
		}

		
	}
	
}


