import java.util.*;

public class Main {
	ArrayList<Integer> num = new ArrayList<Integer>();

	public boolean check( int num ) {
		while ( num != 0 ) {
			int c = num % 10;
			if ( c == 4 || c == 6 ) return false;
			num /= 10;
		}
		return true;
	}
	public long MakeNumber( long old ) {
		long count = 0;
		int i;
		for ( i = 1; ; i++ ) {
			if ( check(i) ) {
				count++;
				if ( count == old ) break;
			}
		}
		return i;
	}
	public static void main ( String[] args ) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("0") ) {
			long index = sc.nextInt();
			index = m.MakeNumber(index);
			System.out.println(index);
		}
	}
}