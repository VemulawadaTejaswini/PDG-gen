public class
Main
{
  public void
  run (
    final java.util.Scanner sc,
    final java.io.PrintStream out
    )
  {
    Pair[ ] heap;
    int[ ]  peah;
    int n, q;
    int i;
    
    n = sc.nextInt ( );
    q = sc.nextInt ( );

    heap = new Pair[ n ];
    peah = new int[ n + 1 ];
    for ( i = 1; i <= n; ++i )
    {
      peah[ i ] = i - 1;
      heap[ peah[ i ] ] = new Pair ( i, 0 );
    }

    for ( ; q > 0; --q )
    {
      int a, v, b;

      a = sc.nextInt ( );
      v = sc.nextInt ( );
      b = heap[ heap.length - 1 ].index;

      swap ( heap, peah[ a ], peah[ b ] );
      swap ( peah, a, heap[ peah[ a ] ].index );
      for ( ; ; )
      {
        if ( peah[ b ] * 2 + 1 < heap.length - 1 && heap[ peah[ b ] * 2 + 1 ].compareTo ( heap[ peah[ b ] ] ) < 0 )
        {
          swap ( heap, peah[ b ], peah[ b ] * 2 + 1 );
          swap ( peah, b, heap[ peah[ b ] ].index );
        }
        else if ( peah[ b ] * 2 + 2 < heap.length - 1 && heap[ peah[ b ] * 2 + 2 ].compareTo ( heap[ peah[ b ] ] ) < 0 )
        {
          swap ( heap, peah[ b ], peah[ b ] * 2 + 2 );
          swap ( peah, b, heap[ peah[ b ] ].index );
        }
        else break ;
      }
      heap[ peah[ a ] ].value += v;
      for ( ; ; )
      {
        if ( peah[ a ] > 0 && heap[ peah[ a ] ].compareTo ( heap[ ( peah[ a ] - 1 ) / 2 ] ) < 0 )
        {
          swap ( heap, peah[ a ], ( peah[ a ] - 1 ) / 2 );
          swap ( peah, a, heap[ peah[ a ] ].index );
        }
        else break ;
      }
      System.out.println ( heap[ 0 ].index + " " + heap[ 0 ].value );
    }
  }

  private static void
  swap (
    int[ ] a,
    int i,
    int j
    )
  {
    final int t = a[ i ];
    a[ i ] = a[ j ];
    a[ j ] = t;
  }

  private static <T> void
  swap (
    T[ ] a,
    int i,
    int j
    )
  {
    final T t = a[ i ];
    a[ i ] = a[ j ];
    a[ j ] = t;
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
  implements Comparable<Pair>
  {
    public int index;
    public int value;

    public
    Pair (
      final int index,
      final int value
      )
    {
      this.index = index;
      this.value = value;
    }

    public int
    compareTo (
      final Pair obj
      )
    {
      if ( this.value == obj.value )
        return ( this.index - obj.index );
      return ( obj.value - this.value );
    }
  }
}