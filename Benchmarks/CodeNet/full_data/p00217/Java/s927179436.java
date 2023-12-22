import java.util.*;

public class Main {
	public static void main ( String[] args ) {
		int n , count , max , maxID;
		int[][] deta = new int[10000][2];
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("0") ) {
			n = sc.nextInt();
			count = 0;
			for ( int i = 0 ; i < n; i++ ) {
				deta[i][0] = sc.nextInt();
				deta[i][1] = sc.nextInt();
				deta[i][1] += sc.nextInt();
				count++;
			}
			max = 0; maxID = 0;
			for ( int i = 0; i < count; i++ ) {
				if ( max < deta[i][1] ) {
					max = deta[i][1];
					maxID = deta[i][0];
				}
			}
			System.out.println(maxID+" "+max);
		}
	}
}