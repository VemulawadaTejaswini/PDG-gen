import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/*
 * K - Stone
 */
public class Main
{

public static void main( String[] args ) throws Exception
{
	new Main().run();
}


public void run() throws Exception
{
	final Scanner sc = new Scanner( getInputStream() );
	final int N = sc.nextInt();
	final int K = sc.nextInt();
	int[] result = new int[ K + 1 ];
	Arrays.fill( result, 0 ); //初期値0、負け-1、勝ち1
	int[] stones = new int[ N ];
	for( int i = 0; i < N; ++i )
	{
		stones[ i ] = sc.nextInt();
	}
	
	for( int i = 0; i <= K; ++ i )
	{
		if( i < stones[ 0 ] )
		{
			//最小のaより小さいので負ける
			result[ i ] = -1;
		}
		else
		{
			//既に調査済みなら無視
			if( result[ i ] != 0 )
			{
				continue;
			}
			
			//デフォルトは負けにしておく
			boolean win = false;
			
			//全てのaについてループ
			for( int s = 0; s < N; ++s )
			{				
				int prevIndex = i - stones[ s ];
				if( prevIndex >= 0 )
				{
					if( result[ prevIndex ] == -1 )
					{
						//1つでも負けに誘導できるなら勝ち
						win = true;
						break;
					}
				}
			}
			
			if( win )
			{
				result[ i ] = 1;
			}
			else
			{
				result[ i ] = -1;
			}
		}
	}
	
	for( int i = 0; i < result.length; ++i )
	{
		//p( i + ":" + result[ i ] );
	}
	
	if( result[ K ] == 1 )
	{
		p( "First" );
	}
	else
	{
		p( "Second" );
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
