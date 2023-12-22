public class
Main
{
  public void
  run (
    final java.util.Scanner sc,
    final java.io.PrintStream out
    )
  {
    int[ ][ ] d;
    int[ ] a, b;
    int n;
    int i, j, k;

    n = sc.nextInt ( );
    a = new int[ n ];
    b = new int[ n ];
    for ( i = 0; i < n; ++i )
    {
      a[ i ] = sc.nextInt ( );
      b[ i ] = sc.nextInt ( );
    }

    d = new int[ n ][ n ];
    for ( j = 0; j < n; ++j )
      d[ 0 ][ j ] = 0;
    for ( i = 1; i < n; ++i )
    for ( j = 0; j + i < n; ++j )
    {
      d[ i ][ j ] = d[ 0 ][ j ] + d[ i - 1 ][ j + 1 ] + a[ j ] * b[ j ] * a[ j + 1 ] * b[ j + i ];
      for ( k = 1; k < i; ++k )
      {
        d[ i ][ j ] = Math.min ( d[ i ][ j ], d[ k ][ j ] + d[ i - k - 1 ][ j + k ] + a[ j ] * b[ j + k ] * a[ j + k + 1 ] * b[ j + i ] );
      }
    }
    out.println ( d[ n - 1 ][ 0 ] );
  }

  public static void
  main (
    final String[ ] args
    )
  {
    ( new Main ( ) ).run ( new java.util.Scanner ( System.in ), System.out );
  }
}