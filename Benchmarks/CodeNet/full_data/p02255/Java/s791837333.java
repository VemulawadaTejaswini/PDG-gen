import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	int[] A;
	int N;

	public Main( int N, String data )
	{
		this.N = N;
		String[] img = data.split(" ");
		A = new int[N];
		
		for( int i = 0; i < N; i++ )
		{
			A[i] = Integer.parseInt(img[i]);
		}
		
		print( );
		sort( );
	}
	
	public void sort( )
	{
		for( int i = 1; i < N; i++ )
        {
			int porInsertar = A[ i ];
            
            boolean termino = false;
            
            for( int j = i; j > 0 && !termino; j-- )
            {
                int actual = A[ j - 1 ];
                if( actual > porInsertar )
                {
                    A[ j ] = actual;
                    A[ j - 1 ] = porInsertar;
                }
                else
                    termino = true;
            }
            print();
        }
	}
	
	public void print( )
	{
		for (int i = 0; i < N-1; i++) 
		{
			System.out.print(A[i] + " ");
		}
		System.out.println( A[N-1] );
	}
	

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String in = "";
		
		while( ( in = br.readLine( ) ) != null )
		{
			Main main = new Main( Integer.parseInt(in), br.readLine() );
		}
	}
}