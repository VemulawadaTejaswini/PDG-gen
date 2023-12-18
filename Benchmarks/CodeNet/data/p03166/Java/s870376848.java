import java.util.*;
import java.io.*;

/*
 * G - LP
 */
public class Main
{
private Map< Integer, List< Integer >> m;
private Set< Integer > fromSet;
private Map< Integer, Integer > cache;

public static void main( String[] args ) throws Exception
{
	new Main().run();
}

public void run() throws Exception
{
	final Scanner sc = new Scanner( getInputStream() );
	final int N = sc.nextInt();
	final int M = sc.nextInt();
	
	m = new HashMap<>(N*2);
	fromSet = new HashSet<>(N*2);
	cache = new HashMap<>(N*2);

	for( int i = 0; i < M; ++i )
	{
		int from = sc.nextInt();
		int to = sc.nextInt();

		List< Integer > list = m.get( to );
		if( list == null )
		{
			list = new ArrayList<>();
			m.put( to, list );
		}
		list.add( from );
		fromSet.add( from );
	}
	//p( fromSet );
	Set< Integer > toSet = new HashSet<>( m.keySet() );
	toSet.removeAll( fromSet );
	//p( toSet );
	//p( m );

	//全ての最終ノード候補についてループ
	int max = 0;
	for( final Integer lastNode : toSet )
	{
		int lp = getLP( lastNode );
		if( max < lp )
		{
			max = lp;
		}
	}
	p( max );
}

public int getLP( final int to )
{
	Integer cachedValue = cache.get( to );
	if( cachedValue != null )
	{
		return cachedValue.intValue();
	}
	else
	{
		int max = 0;
		final List< Integer > list = m.get( to );
		if( list != null )
		{
			for( Integer i : list )
			{
				int lp = getLP( i );
				if( max < lp )
				{
					max = lp;
				}
			}
			max += 1;
		}
		cache.put( to, max );
		return max;
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
