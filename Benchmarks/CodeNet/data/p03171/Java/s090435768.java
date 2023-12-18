import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/*
 * L - Deque
 */
public class Main
{
long[][] cache;

public static void main( String[] args ) throws Exception
{
	new Main().run();
}

public void run() throws Exception
{
	final Scanner sc = new Scanner( getInputStream() );
	final int N = sc.nextInt();
	cache = new long[ N ][ N ];
	long[] data = new long[ N ];
	for( int i = 0; i < N; ++i )
	{
		data[ i ] = sc.nextLong();
	}
	long sum = sum( data, 0, N - 1 );
	long x = getScore( data, 0, N -1 );
	long y = sum - x;
	/*
	p( x );
	p( y );
	p( sum );
	*/
	p( sum - 2*y );
}

public long getScore( final long[] data, int start, int end )
{
	if( start == end )
	{
		return data[ start ];
	}
	else
	{
		long cached = cache[ start ][ end ];
		if( cached != 0 )
		{
			return cached;
		}
		else
		{
			long sum = sum( data, start, end );
			long leftScore = sum - getScore( data, start + 1, end );
			long rightScore = sum - getScore( data, start, end -1 );
			
			long result = leftScore > rightScore ? leftScore : rightScore;
			cache[ start ][ end ] = result;
			return result;
		}
	}
}

public static long sum( long[] data, int start, int end )
{
	long sum = 0;
	for( int i = start; i <= end; ++i )
	{
		sum += data[ i ];
	}
	return sum;
}

public static void p( Object o )
{
	System.out.println( o );
}

public static InputStream getInputStream() throws IOException
{
	//p( System.getProperties() );
	if( System.getProperty( "test" ) != null )
	{
		return new FileInputStream( "1" );
	}
	else
	{
		return System.in;
	}
}

}
