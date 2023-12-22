
import java.util.Scanner;

class Main{
	static class Pair{
		public int x, y;
		Pair( int xx, int yy ){ x=xx; y=yy; }
	}
	public static void main(String[]av){
		Scanner sc = new Scanner( System.in );
		java.util.ArrayList<Pair> list = new java.util.ArrayList<Pair>();
		while( sc.hasNextInt() )	{
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.add( new Pair( Math.max(x,y), Math.min(x,y)));
		}
		for ( Pair p : list ){
			int x = p.x;
			int y = p.y;
			do{
				int	z = x % y;
				x = y;
				y = z;
			}while( 0 < y );
			System.out.println( x + " " + p.x*p.y/x );
		}
	}
}
				