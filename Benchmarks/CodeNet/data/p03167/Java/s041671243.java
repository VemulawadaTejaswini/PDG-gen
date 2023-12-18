import java.util.*;
import java.io.*;
import java.math.BigInteger;

/*
 * H - Grid
 */
public class Main
{
private BigInteger[][] cache;
private boolean[][] wall;

public static void main( String[] args ) throws Exception
{
	new Main().run();
}

public void run() throws Exception
{
	final BufferedReader reader = new BufferedReader( new InputStreamReader( getInputStream() ) );
	String line = reader.readLine();
	String[] array = line.split( " " );
	final int H = Integer.parseInt( array[ 0 ] );
	final int W = Integer.parseInt( array[ 1 ] );
	wall = new boolean[ H ][];
	cache = new BigInteger[ H ][];
	for( int i = 0; i < H; ++i )
	{
		cache[ i ] = new BigInteger[ W ];
		Arrays.fill( cache[ i ], null );
	}
	int h = 0;
	while( true )
	{
		line = reader.readLine();
		if( line == null )
		{
			break;
		}
		wall[ h ] = new boolean[ W ];
		for( int i = 0; i < W; ++i )
		{
			wall[ h ][ i ] = (line.charAt( i ) == '#');
		}
		++h;
	}

	h = H - 1;
	int w = W - 1;

	BigInteger count = getRouteCount( h, w );
	p( count.mod( BigInteger.valueOf( 1000000000L + 7 ) ) );
	//p( count % (1000000000L + 7) );
}

public BigInteger getRouteCount( final int h, final int w )
{
	if( h == 0 && w == 0 )
	{
		return BigInteger.valueOf( 1 );
	}
	else
	{
		BigInteger cached = cache[ h ][ w ];
		if( cached != null )
		{
			return cached;
		}
		if( wall[ h ][ w ] == true )
		{
			final BigInteger result = BigInteger.valueOf( 0 );
			cache[ h ][ w ] = result;
			return result;
		}
		else
		{
			BigInteger count = BigInteger.valueOf( 0 );
			if( h > 0 )
			{
				count = count.add( getRouteCount( h - 1, w ) );
			}
			if( w > 0 )
			{
				count = count.add( getRouteCount( h, w - 1 ) );
			}
			cache[ h ][ w ] = count;
			return count;
		}
	}
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
