import java.util.*;
import java.io.*;

/*
 * F - LCS
 */
public class Main
{
static char[] s;
static char[] t;
static String result = "";

public static void main( String[] args ) throws Exception
{
	final BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
	s = reader.readLine().toCharArray();
	t = reader.readLine().toCharArray();

	for( int sHead = 0; sHead < s.length; ++sHead )
	{
		final StringBuilder sb = new StringBuilder( 3000 );
		search( sHead, 0, sb );
	}

	p( result );
}

public static void search( int sPos, int tHead, final StringBuilder sb )
{
	if( sPos == s.length || tHead == t.length )
	{
		return;
	}

	boolean found = false;
	for( int i = tHead; i < t.length; ++i )
	{
		//tについて検索していく
		if( s[ sPos ] == t[ i ] )
		{
			found = true;
			StringBuilder sb2 = new StringBuilder( sb.toString() );
			sb2.append( s[ sPos ] );
			search( sPos + 1, i + 1, sb2 );
			{
				String tmpResult = sb2.toString();
				if( tmpResult.length() > result.length() )
				{
					result = tmpResult;
				}
			}
		}
	}
	StringBuilder sb2 = new StringBuilder( sb.toString() );
	search( sPos + 1, tHead, sb2 );

	{
		String tmpResult = sb2.toString();
		if( tmpResult.length() > result.length() )
		{
			result = tmpResult;
		}
	}
}

public static void p( Object o )
{
	System.out.println( o );
}

}