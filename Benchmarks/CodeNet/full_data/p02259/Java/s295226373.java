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
      for ( j = 1; j < a.length - i; ++j )
      {
        if ( a[ j ] < a[ j - 1 ] )
          swap ( a, j - 1, j );
      }
    }
  }
  
  private void
  swap (
    int[ ] a,
    int    i,
    int    j
    )
  {
    final int t = a[ i ];
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