import java.util.*;
import java.io.*;
import java.math.BigInteger;

/*
 * H - Grid
 */
public class Main
{
private double[] trueProb;

public static void main( String[] args ) throws Exception
{
	new Main().run();
}

public void run() throws Exception
{
	final Scanner sc = new Scanner( getInputStream() );
	final int N = sc.nextInt();
	double[] p = new double[ N ];
	for( int i = 0; i < N; ++i )
	{
		p[ i ] = sc.nextDouble();
	}
	trueProb = new double[ N + 1 ];
	trueProb[ 0 ] = 1.0;//一番初めはTRUEの回数が0であるパターンの確率が100%

	for( int i = 1; i <= N; ++i )
	{
		f1( i, p[ i - 1 ] );
	}

	double prob = 0;
	for( int i = (N + 1) / 2; i <= N; ++i )
	{
		prob += trueProb[ i ];
	}

	p( prob );
}

/*
 * n回目
 */
private void f1( int n, double prob )
{
	for( int i = n; i >= 0; --i )
	{
		if( i == n )
		{
			trueProb[ i ] = trueProb[ i - 1 ] * prob;
		}
		else if( i == 0 )
		{
			trueProb[ 0 ] = trueProb[ 0 ] * (1 - prob);
		}
		else
		{
			trueProb[ i ] = trueProb[ i - 1 ] * prob + trueProb[ i ] * (1 - prob);
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
