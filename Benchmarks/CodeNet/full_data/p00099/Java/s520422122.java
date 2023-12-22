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
    int[ ]  paeh;
    int n, q;
    int i;
    
    n = sc.nextInt ( );
    q = sc.nextInt ( );

    heap = new Pair[ n ];
    paeh = new int[ n + 1 ];
    for ( i = 1; i <= n; ++i )
    {
      paeh[ i ] = i - 1;
      heap[ paeh[ i ] ] = new Pair ( i, 0 );
    }

    for ( ; q > 0; --q )
    {
      int a, v;

      a = sc.nextInt ( );
      v = sc.nextInt ( );

      heap[ paeh[ a ] ].value += v;
      for ( ; ; )
      {
        if ( v > 0 )
        {
          if ( paeh[ a ] > 0
            && heap[ paeh[ a ] ].compareTo ( heap[ ( paeh[ a ] - 1 ) / 2 ] ) < 0 )
          {
            swap ( heap, paeh[ a ], ( paeh[ a ] - 1 ) / 2 );
            swap ( paeh, a, heap[ paeh[ a ] ].index );
          }
          else break ;
        }
        else if ( v < 0 )
        {
          if ( paeh[ a ] * 2 + 2 < heap.length - 1
            && heap[ paeh[ a ] * 2 + 2 ].compareTo ( heap[ paeh[ a ] * 2 + 1 ] ) < 0
            && heap[ paeh[ a ] * 2 + 2 ].compareTo ( heap[ paeh[ a ] ] ) < 0 )
          {
            swap ( heap, paeh[ a ], paeh[ a ] * 2 + 2 );
            swap ( paeh, a, heap[ paeh[ a ] ].index );
          }
          else if ( paeh[ a ] * 2 + 1 < heap.length - 1
                 && heap[ paeh[ a ] * 2 + 1 ].compareTo ( heap[ paeh[ a ] ] ) < 0 )
          {
            swap ( heap, paeh[ a ], paeh[ a ] * 2 + 1 );
            swap ( paeh, a, heap[ paeh[ a ] ].index );
          }
          else break ;
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
    public final int index;
    public       int value;

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