import java.util.Scanner;
public class Main {
	public static int[] a = new int[4];
	public static char[] op = new char[3];
	public static void dfs( int n ) {
		if( n == 3 ) {
			int sum = a[0];
			for( int i = 0; i < 3; i++ ) {
				if( op[i] == '+'  )
					sum += a[i+1];
				else
					sum -= a[i+1];
			}
			if(sum == 7) {
				for( int i = 0; i < 4; i++ ) {
					if( i != 3 )
						System.out.print( a[i] + "" + op[i] );
					else
						System.out.println( a[i] + "=7" );
				}
				System.exit(0);
			}
		}
		else {
			op[n] = '+';
			dfs(n+1);
			op[n] = '-';
			dfs(n+1);
		}
	}
	
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		a[0] = s.charAt(0)-'0';
		a[1] = s.charAt(1)-'0';
		a[2] = s.charAt(2)-'0';
		a[3] = s.charAt(3)-'0';
		dfs(0);
		sc.close();
	}
}