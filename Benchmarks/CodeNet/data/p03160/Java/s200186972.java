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
		long scoreIf1 = score1 + diff1;
		long scoreIf2 = score2 + diff2;
		if( scoreIf1 < scoreIf2 )
		{
			score = scoreIf1;
		}
		else
		{
			score = scoreIf2;
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