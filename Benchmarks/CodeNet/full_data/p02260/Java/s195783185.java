public class
Main
{
  private int swc;

  private void
  sort (
    int[ ] a
    )
  {
    int i, j;

    for ( i = 0; i < a.length; ++i )
    {
      int m = i;

      for ( j = i; j < a.length; ++j )
      {
        if ( a[ j ] < a[ m ] )
          m = j;
      }
      swap ( a, i, m );
    }
  }
  
  private void
  swap (
    int[ ] a,
    int    i,
    int    j
    )
  {
    int t;

    if ( i == j ) return ;

    t      = a[ i ];
    a[ i ] = a[ j ];
    a[ j ] = t;
    ++swc;
  }

  private void
  printArray (
    int[ ] a
    )
  {
    int i;

    for ( i = 0; i < a.length; ++i )
    {
      System.out.print ( a[ i ] );
      if ( i + 1 < a.length )
        System.out.print ( " " );
      else
        System.out.println ( );
    }
  }

  public void
  run (
    java.util.Scanner sc
    )
  {
    int[ ] a;
    int i, j;

    a = new int[ sc.nextInt ( ) ];
    for ( i = 0; i < a.length; ++i )
      a[ i ] = sc.nextInt ( );

    swc = 0;
    sort ( a );
    printArray ( a );
    System.out.println ( swc );
  }

  public static void
  main (
    String[ ] args
    )
  {
    ( new Main ( ) ).run ( new java.util.Scanner ( System.in ) );
  }
}