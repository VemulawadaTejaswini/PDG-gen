import java.text.DecimalFormat;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n =sc.nextInt();
			if( n == 0 ) break;
			int[][] map = new int[n][n];
			for(int i=0;i<n;i++) for(int j=0;j<n;j++) {
				map[ ( n/2+1 + j + i ) % n][ ( n/2 + j - i + n ) % n ] = i * n + j + 1;
			}
			for(int i=0;i<n;i++)for(int j=0;j<n;j++) System.out.printf("%4d%s",map[i][j], (j==n-1? "\n": ""));
		}
	}
}