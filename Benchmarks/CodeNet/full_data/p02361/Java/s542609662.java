public class
Main
{
  public void
  run (
    java.io.InputStream in,
    java.io.PrintStream out
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( in );
    java.util.List[ ] G, p;
    int[ ] res;
    int n, m, r;
    int i;

    n = sc.nextInt ( );
    m = sc.nextInt ( );
    r = sc.nextInt ( );

    G = new java.util.List[ n ];
    p = new java.util.List[ n ];
    for ( i = 0; i < n; ++i )
    {
      G[ i ] = new java.util.LinkedList ( );
      p[ i ] = new java.util.LinkedList ( );
    }
    for ( i = 0; i < m; ++i )
    {
      int s, t, d;

      s = sc.nextInt ( );
      t = sc.nextInt ( );
      d = sc.nextInt ( );
      G[ s ].add ( t );
      p[ s ].add ( d );
    }

    res = dijkstra ( convertGraph ( G ), convertGraph ( p ), r );
    for ( i = 0; i < res.length; ++i )
    {
      if ( res[ i ] < 0 )
        out.println ( "INF" );
      else
        out.println ( res[ i ] );
    }

    sc.close ( );
  }

  /** ??°?????????List ??¨???????¨?????????????????????? */
  private static int[ ][ ]
  convertGraph (
    java.util.List[ ] G
    )
  {
    int[ ][ ] r = new int[ G.length ][ ];
    java.util.Iterator it;
    int i, j;

    for ( i = 0; i < r.length; ++i )
    {
      r[ i ] = new int[ G[ i ].size ( ) ];
      for ( j = 0, it = G[ i ].iterator ( ); it.hasNext ( ); ++j )
        r[ i ][ j ] = ( (Integer)it.next ( ) ).intValue ( );
    }

    return ( r );
  }

  /** ??????????????°??????(G,p) ???????????????
    * ??????s ????§??????¨????????????????????????????????????????±??????????
    * 
    * r[ t ]: ??????s ????????????t ????????????????????? (???????????°?????????)
    */
  private static int[ ]
  dijkstra (
    int[ ][ ] G,
    int[ ][ ] p,
    int s
    )
  {
    class Status implements Comparable<Status> {
      int v, d;
      public Status ( int v, int d ) { this.v = v; this.d = d; }
      public int compareTo ( Status o ) { return ( this.d - o.d ); }
    }
    java.util.PriorityQueue<Status> lis;
    int[ ] r;
    int i;

    r = new int[ G.length ];
    java.util.Arrays.fill ( r, -1 );

    lis = new java.util.PriorityQueue<Status> ( );
    lis.add ( new Status ( s, 0 ) );
    while ( !lis.isEmpty ( ) )
    {
      Status st = lis.poll ( );

      if ( r[ st.v ] >= 0 )
        continue ;

      r[ st.v ] = st.d;
      for ( i = 0; i < G[ st.v ].length; ++i )
        lis.add ( new Status ( G[ st.v ][ i ], r[ st.v ] + p[ st.v ][ i ] ) );
    }

    return ( r );
  }

  public static void
  main (
    String[ ] args
    )
  {
    ( new Main ( ) ).run ( System.in, System.out );
  }
}