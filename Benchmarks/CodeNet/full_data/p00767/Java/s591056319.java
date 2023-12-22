package task1186;

public class Main {
  
  public static boolean
  smallerp (
    int h1,
    int w1,
    int h2,
    int w2
    )
  {
    if ( h1 * h1 + w1 * w1 <  h2 * h2 + w2 * w2 ) return ( true );
    if ( h1 * h1 + w1 * w1 == h2 * h2 + w2 * w2
      && h1 < h2 ) return ( true );
    
    return ( false );
  }
  
  public static void
  main (
    String[ ] args
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int i, j;
    
    for ( ; ; )
    {
      int h, w;
      int p = 150, q = 150;
      
      h = sc.nextInt ( );
      w = sc.nextInt ( );
      if ( h == 0 && w == 0 ) break ;
      
      for ( i = 1; i <= 150; ++i )
      for ( j = i + 1; j <= 150; ++j )
      if ( smallerp ( h, w, i, j )
        && smallerp ( i, j, p, q ) )
      {
        p = i;
        q = j;
      }
      
      System.out.println ( p + " " + q );
    }
    
    return ;
  }
}