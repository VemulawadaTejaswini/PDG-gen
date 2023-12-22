import java.util.*;

public class Main {
	int count;
	public boolean check( String[][] deta , int i , int j , int count ) {
		int toi = i , toj = j;
		for ( i = toi; i < toi+count; i++ )
			for ( j = toj; j < toj+count; j++ )
				if ( deta[i][j].equals("*") )
					return false;
		return true;
	}
	
	public static void main ( String args[] ) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		while ( !sc.hasNext("0") ) {
			m.count = 1;
			String[][] square = new String[1000][1000];
			int n = sc.nextInt();
			for ( int i = 0; i < n; i++ ) {
				String s = sc.next();
				StringBuffer str = new StringBuffer(s); 
				for ( int j = 0; j < n; j++ )
					square[i][j] = str.substring(j,j+1);
			}
			for ( int i = 0; i < n-m.count; i++ ) {
				for ( int j = 0; j < n-m.count; j++ ) {
					while ( true ) {
						if ( m.check(square,i,j,m.count) )
							m.count++;
						else
							break;
					}
				}
			}
			System.out.println(m.count-1);
		}
	}
}
	