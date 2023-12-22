public class
Main
{
  public void
  run (
    final java.util.Scanner sc,
    final java.io.PrintStream out
    )
  {
    final java.util.List<Integer> u = new java.util.LinkedList<Integer> ( );
    final java.util.List<Pair> v = new java.util.LinkedList<Pair> ( );
    boolean[ ] b;
    int m, n;
    java.util.ListIterator<Integer> it;
    java.util.ListIterator<Pair> pt;
    int i;

    m = sc.nextInt ( );
    n = sc.nextInt ( );
    b = new boolean[ m + 1 ];
    for ( i = 1; i <= m; ++i )
      u.add ( i );
    for ( i = 0; i < n; ++i )
    {
      int x, y;

      y = sc.nextInt ( );
      x = sc.nextInt ( );
      v.add ( new Pair ( x, y ) );
    }

    while ( !u.isEmpty ( ) )
    {
      java.util.Arrays.fill ( b, true );

      for ( pt = v.listIterator ( ); pt.hasNext ( ); )
        b[ pt.next ( ).a ] = false;

      for ( it = u.listIterator ( ); it.hasNext ( ); )
      {
        final int e = it.next ( );

        if ( b[ e ] )
        {
          out.println ( e );
          it.remove ( );
        }
      }

      for ( pt = v.listIterator ( ); pt.hasNext ( ); )
      {
        final Pair e = pt.next ( );

        if ( b[ e.b ] )
          pt.remove ( );
      }
    }
  }

  public static void
  main (
    final String[ ] args
    )
  {
    ( new Main ( ) ).run ( new java.util.Scanner ( System.in ), System.out );
  }

  private class
  Pair
  {
    public int a;
    public int b;

    public
    Pair (
      int a,
      int b
      )
    {
      this.a = a;
      this.b = b;
    }
  }
}