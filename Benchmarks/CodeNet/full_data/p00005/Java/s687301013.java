
import java.util.Scanner;

class Main{
	static class Pair{
		public long x, y;
		Pair( long xx, long yy ){ x=xx; y=yy; }
	}
	public static void main(String[]av){
		Scanner sc = new Scanner( System.in );
		java.util.ArrayList<Pair> list = new java.util.ArrayList<Pair>();
		while( sc.hasNextInt() )	{
			long x = sc.nextInt();
			long y = sc.nextInt();
			list.add( new Pair( Math.max(x,y), Math.min(x,y)));
		}
		for ( Pair p : list ){
			long x = p.x;
			long y = p.y;
			do{
				long	z = x % y;
				x = y;
				y = z;
			}while( 0 < y );
			System.out.println( x + " " + p.x*p.y/x );
		}
	}
}
				