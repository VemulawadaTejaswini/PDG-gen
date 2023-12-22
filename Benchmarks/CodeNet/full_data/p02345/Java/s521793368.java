import java.util.* ;


/* An <O(N logN), O(1)> solution 
   processing time is <O(N logN) and query time is O(1) .
   
   Sparse Table (ST) algorithm :
   
   
   Range Minimum Query (RMQ) is used on arrays to find 
   the position of an element with the minimum value between 
   two specified indices.
 
 */
public class ABC
{
	int M[][] ;
  	void process(int[] A) 
  	{
 		int i , j , k ;
 		int n , m ,N;
 		N = A.length ;
 		for( i = 0 ; (1 << i) < N; i++) ;
 		if( ( 1<<(i-1)) == N )
 			i = i -1 ;
 		m = i ;
 		M = new int[N][i+1] ;
        // initialize M for the intervals of length one
        for (i = 0; i < N; i++)
            M[i][0] = i;
        // compute values from smaller to bigger
        for (j = 1; j <= m ; j++) 
        {
            for (i = 0; i < N; i++) 
            {
            	if( (i + (1 << (j - 1))) < N )
            	{
                	if (A[M[i][j - 1]] < A[M[i + (1 << (j - 1))][j - 1]])
                    	M[i][j] = M[i][j - 1];
                	else
                	    M[i][j] = M[i + (1 << (j - 1))][j - 1];
               	}
               	else
               		M[i][j] = M[i][j - 1];               	
            }
        }
       	for( i = 0 ; i < N ; i ++ )
        {
        	for( j = 0 ; j <= m ; j++ )
        	{
        		System.out.print(" "+A[M[i][j]]);
        	}
        	System.out.println();
        }
    }
    
	 int rMQ( int[] A, int i, int j) 
	 {
 		if( i == j )
 			return i ;
 			int k ;
        for( k = 0 ; (1<<k) < (j-i+1) ; k++ )
        {
        	if((1<<k)== (j-i+1) || (1<<(k+1)) > (j-i+1))
        		break ;
        }
        //System.out.println(i+" "+k+" "+(1<<k)+" "+(j - (1 << k) + 1));
        if (A[M[i][k]] <= A[M[j - (1 << k) + 1][k]])
            return M[i][k];
        else
            return M[j - (1 << k) + 1][k];
    }
    int ar[] ;
    public static void main( String s[] )
	{
		int ar[] = {2,5,1,4,9,3} ;
		ABC ob = new ABC() ;
		ob.process(ar);
		System.out.println(ar[ob.rMQ(ar,1,3)]);
		
	}
}