public class
Main
{
  private static final int N = 999983;

  public void
  run (
    final java.util.Scanner sc,
    final java.io.PrintStream out
    )
  {
    final int[ ] sum = new int[ N + 1 ];
    int i, j;

    java.util.Arrays.fill ( sum, 2, sum.length, 1 );
    for ( i = 2; i * i < sum.length; ++i )
    {
      if ( sum[ i ] == 0 ) continue;
      for ( j = i + i; j < sum.length; j += i )
        sum[ j ] = 0;
    }
    for ( i = 1; i < sum.length; ++i )
      sum[ i ] += sum[ i - 1 ];

    for ( ; ; )
    {
      int res;
      int n;

      n = sc.nextInt ( );
      if ( n == 0 ) break ;

      res = -n;
      for ( i = 0; i < n; ++i )
      {
        int p, m;

        p = sc.nextInt ( );
        m = sc.nextInt ( );
        res += sum[ Math.min ( sum.length - 1, p + m ) ] - sum[ Math.max ( 0, p - m - 1 ) ];
      }
      out.println ( res );
    }
  }

  public static void
  main (
    final String[ ] args
    )
  {
    ( new Main ( ) ).run ( new java.util.Scanner ( System.in ), System.out );
  }
}