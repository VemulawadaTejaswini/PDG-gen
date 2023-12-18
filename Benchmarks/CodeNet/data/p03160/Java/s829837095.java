import java.util.*;
import java.io.*;

public class Main
{

public static void main( String[] args ) throws Exception
{
	final Scanner sc = new Scanner( System.in );
	final int N = sc.nextInt();
	long score1 = 0;
	long score2 = 0;
	
	int firstH = sc.nextInt();
	int pos1 = firstH;
	int pos2 = firstH;
	
	while( sc.hasNext() )
	{
		int h = sc.nextInt();
		long score = 0;
		int diff1 = Math.abs( pos1 - h );
		int diff2 = Math.abs( pos2 - h );
		if( diff1 < diff2 )
		{
			score = score1 + diff1;
		}
		else
		{
			score = score2 + diff2;
		}
		pos1 = pos2;
		pos2 = h;
		
		score1 = score2;
		score2 = score;
	}
	p( score2 );
}

public static void p( Object o )
{
	System.out.println( o );
}

}