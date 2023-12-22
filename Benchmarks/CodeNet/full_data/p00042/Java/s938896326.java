public class
Main
{
  private int[ ][ ] opt;
  private int[ ] p;
  private int[ ] w;
  private int n;
  private int c;

  private int opt_p;
  private int opt_w;
  
  private void
  dp (
    )
  {
    int i, j;
    
    opt = new int[ n + 1 ][ c + 1 ];
    
    /* (1) 基底 */
    for ( i = 0; i <= c; ++i )
      opt[ 0 ][ i ] = 0;
    
    /* (2) 再帰逆行 */
    for ( i = 1; i <= n; ++i )
    for ( j = 0; j <= c; ++j )
    {
      opt[ i ][ j ] = opt[ i - 1 ][ j ];
      if ( w[ i - 1 ] < j )
      {
        opt[ i ][ j ] = Math.max ( opt[ i ][ j ], opt[ i - 1 ][ j - w[ i - 1 ] ] + p[ i - 1 ] );
      }
    }
    
    /* (3) 解の抽出 */
    opt_p = opt[ n ][ c ];
    opt_w = 0;
    for ( j = c, i = n; i > 0; --i )
    {
      if ( opt[ i - 1 ][ j ] != opt[ i ][ j ] )
      {
        j -= w[ i - 1 ];
        opt_w += w[ i - 1 ];
      }
    }
  }
  
  public void
  run (
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int no = 0;
    int i;
    
    for ( ; ; )
    {
      c = sc.nextInt ( );
      if ( c == 0 ) break ;
      n = sc.nextInt ( );
      w = new int[ n ];
      p = new int[ n ];
      for ( i = 0; i < n; ++i )
      {
        String[ ] s = sc.next ( ).split ( "," );
        p[ i ] = Integer.parseInt ( s[ 0 ] );
        w[ i ] = Integer.parseInt ( s[ 1 ] );
      }
      
      dp ( );
      System.out.println ( "Case " + ( ++no ) + ":" );
      System.out.println ( opt_p );
      System.out.println ( opt_w );
    }
    
    return ;
  }
  
  public static void
  main (
    String[ ] args
    )
  {
    ( new Main ( ) ).run ( );
    
    return ;
  }
}