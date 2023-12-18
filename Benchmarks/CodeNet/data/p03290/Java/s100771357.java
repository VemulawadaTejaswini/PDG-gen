import java.util.Scanner;
public class Main {
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int g = sc.nextInt();
		int[] p = new int[d];
		int[] c = new int[d];
		int[] s = new int[d];
		
		for( int i = 0; i < d; i++ ) {
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
			s[i] = p[i] * 100 * (i+1) + c[i];
		}
		
		int ans = 0;
		for( int i = 0; i < d; i++ )
			ans += p[i];
		
		
		for( int i = 0; i < (1<<d); i++ ) {
			int sum = 0;
			int s1 = 0;
			int num = 0;
			for( int j = 0; j < d; j++ ) {
				if( (1&(i>>j)) == 1 ) { 
					sum += s[j];
					num += p[j];
				}
				else
					s1 = j;
			}
			if( sum < g ) {
				int need = (int)Math.ceil((double)(g - sum)/(100 * (s1+1)));
				if( need < p[s1] ) {
					ans = Math.min(ans, num+need);
				}
				
			}
			else {
				ans = Math.min(ans, num);
			}
			
		}
		System.out.println( ans );
		
		
		sc.close();
	}
}
