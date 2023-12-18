import java.util.*;
import java.io.*;
import java.math.BigInteger;

/*
 * J - Sushi
 */
public class Main
{
private Map< String, Double > cache = new HashMap<>();

public static void main( String[] args ) throws Exception
{
	new Main().run();
}

public void run() throws Exception
{
	final Scanner sc = new Scanner( getInputStream() );
	final int N = sc.nextInt();
	double[] data = new double[] { 0, 0, 0, 0 };
	for( int i = 0; i < N; ++i )
	{
		data[ sc.nextInt() ]++;
	}
	p( getE2( N, data ) );
}

/*

{
	double[] e = new double[] { 0 };//期待値
	double[] data = new double[] { 1, 1, 0, 0 };
	getE( 0, 1, 2, data, e );
	p( "----" );
	p( e[ 0 ] );
	p( "" );
}


{
	double[] e = new double[] { 0 };//期待値
	double[] data = new double[] { 0, 0, 0, 1 };
	getE( 0, 1, 1, data, e );
	p( "----" );
	p( e[ 0 ] );
	p( "" );
}

{
	double[] e = new double[] { 0 };//期待値
	double[] data = new double[] { 2, 1, 0, 0 };
	getE( 0, 1, 3, data, e );
	p( "----" );
	p( e[ 0 ] );
	p( "" );
}

{
	double[] e = new double[] { 0 };//期待値
	double[] data = new double[] { 2, 0, 1, 0 };
	getE( 0, 1, 3, data, e );
	p( "----" );
	p( e[ 0 ] );
	p( "" );
}

{
	double[] e = new double[] { 0 };//期待値
	double[] data = new double[] { 1, 2, 0, 0 };
	getE( 0, 1, 3, data, e );
	p( "----" );
	p( e[ 0 ] );
	p( "" );
}

{
	double[] e = new double[] { 0 };//期待値
	double[] data = new double[] { 10, 10, 10, 10 };
	getE( 0, 1, 40, data, e );
	p( "----" );
	p( e[ 0 ] );
	p( "" );
}

{
	double[] data = new double[] { 1, 1, 1, 0 };
	p( getE2( 3, data ) );
}

{
	double[] data = new double[] { 297, 3, 0, 0 };
	p( getE2( 300, data ) );
}
*/

/*
 * すばり回数の期待値を返す
 */
public double getE2( double dish_size, double[] data )
{
	StringBuffer buf = new StringBuffer();
	for( int i = 0; i < data.length; ++i )
	{
		if( i > 0 )
		{
			buf.append( ',' );
		}
		buf.append( (int)data[ i ] );
	}
	String key = buf.toString();
	//p( key );
	Double found = cache.get( key );
	if( found != null )
	{
		//p( "found" );
		return found;
	}

	//0とそれ以外の比率を求める
	double count = 0;
	for( int i = 1; i <= 3; ++i )
	{
		count += data[ i ];
	}
	double p = count / (count + data[ 0 ]);
	if( p == 0 )
	{
		return 0;
	}

	double ex = 1 / p;//この状態で次の1つを消費するまでの回数の期待値

	//消費するそれぞれのパターンについて確率を求める
	for( int i = 1; i <= 3; ++i )
	{
		if( data[ i ] > 0 )
		{
			double patternRatio = data[ i ] / count;
			double[] data2 = Arrays.copyOf( data, data.length );
			data2[ i ]--;//今回選択されたものが減る
			data2[ i - 1 ]++;//1つ少ない数が増える
			ex += patternRatio * getE2( dish_size, data2 );
		}
	}

	cache.put( key, ex );
	return ex;
}

public void getE( double num, double ratio, double dish_size, double[] data, double[] e )
{
	boolean finish = false;
	if( ratio < 0.00001 )
	{
		finish = true;
	}
	if( data[ 0 ] == dish_size )
	{
		finish = true;
	}

	if( finish )
	{
		e[ 0 ] += ratio * num;
		//p( num + ":" + ratio * num );
		//p( num + ":" + e[ 0 ] );
		return;
	}

	double total = 0;
	for( int i = 0; i <= 3; ++i )
	{
		if( data[ i ] > 0 )
		{
			double new_ratio = data[ i ] / dish_size * ratio;
			double[] data2 = Arrays.copyOf( data, data.length );
			if( i > 0 )
			{
				data2[ i ]--;//今回選択されたものが減る
				data2[ i - 1 ]++;//1つ少ない数が増える
			}
			getE( num + 1, new_ratio, dish_size, data2, e );
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
