
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

class Reader 
{
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) 
    {
        reader = new BufferedReader(new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
   
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) 
        {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
    
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}

class Main
{
	public static void main( String[] args ) throws IOException
	{
		Reader.init(System.in);
		long x = Reader.nextInt();
		long a = Reader.nextInt();
		long b = Reader.nextInt();
		
		if ( a < x )
		{
			if ( b <= a )
			{
				System.out.println("delicious");
			}
			else if ( a + x < b )
			{
				System.out.println("dangerous");
			}
			else
			{
				System.out.println("safe");
			}
		}
		else
		{
			//System.out.println((a+x)+"  "+(a-x));
			if ( a + x < b ) 
					//|| ( b < x && a-x < b ) )
			{
				System.out.println("dangerous");
			}
			else if ( b >= a-x && a >= b )
			{
				System.out.println("delicious");
			}
			else
			{
				System.out.println("safe");
			}
		}
	}
}
