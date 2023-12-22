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
    final int pivot = a[ low ];
    int l, h;
    int i;

    if ( high <= low )
      return ;

    l = low; h = high;
    while ( l <= h )
    {
      while ( a[ l ] < pivot ) ++l;
      while ( pivot < a[ h ] ) --h;
      if ( h < l ) break ;
      swap ( a, l++, h-- );
    }

    for ( i = 0; i < a.length; ++i )
    {
      if ( i != 0 )
        System.out.print ( " " );
      if ( i == h + 1 ) System.out.print ( "| " );
      if ( i == l )     System.out.print ( "| " );
      System.out.print ( a[ i ] );
    }
    System.out.println ( );

    sort ( a, low, h );
    sort ( a, l, high );
  }

  private static void
  swap (
    int[ ] a,
    int    u,
    int    v
    )
  {
    final int t = a[ u ];
    a[ u ] = a[ v ];
    a[ v ] = t;
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