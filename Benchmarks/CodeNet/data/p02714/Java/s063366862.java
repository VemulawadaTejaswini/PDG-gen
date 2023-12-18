
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S = sc.next();
		char[] s=S.toCharArray();

		long[][] rest = new long [3][n];

		for( int i=0 ; i<3 ; i++) {
			Arrays.fill(rest[i], -1);
		}
		long[] countRGB = {0,0,0};
		for( int i=n-1 ; i>=0 ; i--) {
			int c = "RGB".indexOf(s[i]);
			countRGB[c]++;
			rest[0][i]= countRGB[0];
			rest[1][i]= countRGB[1];
			rest[2][i]= countRGB[2];
		}
		long count=0;
		for( int i=0 ; i<n-2 ; i++) {
			for( int j=i+1 ; j<n-1 ; j++) {
				if( s[i]==s[j] )continue;
				int rgb =restIndex(s, i, j);
				
				count += rest[rgb][j+1];
				if( j+(j-i)<n && "RGB".indexOf(s[j+(j-i)]) == rgb ) {
					count--;
				}
			}
		}
		
		System.out.println(count);
	}

	private static int restIndex(char[] s, int i, int j) {
		if( s[i]=='R' && s[j]=='G') return 2;
		if( s[i]=='G' && s[j]=='R') return 2;
		if( s[i]=='R' && s[j]=='B') return 1;
		if( s[i]=='B' && s[j]=='R') return 1;
		if( s[i]=='B' && s[j]=='G') return 0;
		if( s[i]=='G' && s[j]=='B') return 0;
		return 0;
	}
	
}
