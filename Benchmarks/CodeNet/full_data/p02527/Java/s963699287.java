public class
Main
{
  private static void
  sort (
    int[ ] a,
    int    n
    )
  {
    sort ( a, 0, n - 1 );
  }

  private static void
  sort (
    int[ ] a,
    int    low,
    int    high
    )
  {
    int m;

    if ( low == high )
      return ;

    m = partition ( a, low, high, a[ 0 ] );
    sort ( a, low,   m );
    sort ( a, m + 1, high );
  }

  private static int
  partition (
    int[ ] a,
    int    low,
    int    high,
    int    x
    )
  {
    int[ ] t = new int[ high - low + 1 ];
    int i;

    high = low;
    for ( i = 0; i < t.length; ++i )
    {
      t[ i ] = a[ low + i ];
      if ( t[ i ] < x ) ++high;
    }
    for ( i = 0; i < t.length; ++i )
    {
      if ( t[ i ] < x ) a[ low++ ]  = t[ i ];
      else              a[ high++ ] = t[ i ];
    }

    if ( high - low < t.length ) return ( low - 1 );
    else                         return ( low );
  }

  public static void
  main (
    final String[ ] args
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int[ ] a = new int[ sc.nextInt ( ) ];
    int i;

    for ( i = 0; i < a.length; ++i )
      a[ i ] = sc.nextInt ( );
    sort ( a, a.length );

    for ( i = 0; i < a.length; ++i )
    {
      if ( i != 0 )
        System.out.print ( " " );
      System.out.print ( a[ i ] );
    }
    System.out.println ( );
  }
}