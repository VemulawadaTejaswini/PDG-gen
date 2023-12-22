import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	Scanner sc;
	TreeSet< String > set;
	void run(){
		sc = new Scanner( System.in );
		int n = sc.nextInt();
		for( int i = 0; i < n; i++ ){
			set = new TreeSet< String >();
			String str = sc.next();
			for( int sp = 1; sp < str.length(); sp++ ){
				StringBuffer strb = new StringBuffer( str.substring( sp ) );
				StringBuffer stra = new StringBuffer( str.substring( 0, sp ) );
				set.add( stra.toString() + strb.toString() );
				set.add( strb.toString() + stra.toString() );
				stra.reverse();
				set.add( stra.toString() + strb.toString() );
				set.add( strb.toString() + stra.toString() );
				stra.reverse();
				strb.reverse();
				set.add( stra.toString() + strb.toString() );
				set.add( strb.toString() + stra.toString() );
				stra.reverse();
				set.add( stra.toString() + strb.toString() );
				set.add( strb.toString() + stra.toString() );
			}
			System.out.println( set.size() );
		}
	}
	public static void main( String[] args ){
		new Main().run();
	}
}