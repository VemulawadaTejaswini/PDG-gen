import java.util.*;

public class Main {
	String[] deta = new String[1000];
	int[] Count = new int[1000];
	int maxIndex = 0;
	
	public boolean check( int count , String in ) {
		for ( int i = 0; i < count; i++ ) {
			if ( deta[i].equals(in) ) {
				Count[i]++;
				if ( Count[maxIndex] < Count[i] )
					maxIndex = i;
				return false;
			}
		}
		return true;
	}
	
	public static void main ( String args[] ) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine() , maxstr = "";
		sc = new Scanner(in);
		int count = 0;
		while ( sc.hasNext() ) {
			in = sc.next();
			if ( maxstr.length() < in.length() )
				maxstr = in;
			if ( m.check(count, in) ) {
				m.deta[count] = in;
				count++;
			}
		}
		System.out.println(m.deta[m.maxIndex]+" "+maxstr);
	}
}