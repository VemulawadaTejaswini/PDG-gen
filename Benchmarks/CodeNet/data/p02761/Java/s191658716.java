import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];
		int[] ans = new int[n+1];

		for (int i = 0;i<m ;i++ ) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		for (int i = 0;i<m-1 ;i++ ) {
			if (s[i]>s[i+1]) {
				int temp = s[i];
				s[i] = s[i+1];
				s[i+1] = temp;
				int temp2 = c[i];
				c[i] = c[i+1];
				c[i+1] = temp2;
			}
		}

		int j = 1;

		for (int i = 0;i<m ;i++ ) {
			if (s[i]==j) {
				ans[j-1] = c[i];
			}
			j++;
		}

		if (ans[0]==0) {
			System.out.println(-1);
			System.exit(0);
		}

		for (int i = 0;i<n ;i++ ) {
			System.out.print(ans[i]);
		}
		System.out.println();




	}
}
