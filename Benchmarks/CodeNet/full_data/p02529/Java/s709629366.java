public class
Main
{
  public void
  run (
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    java.util.Set<Integer> lis = new java.util.TreeSet<Integer> ( );
    int res = 0;
    int n;
    int i;
    
    n = sc.nextInt ( );
    for ( i = 0; i < n; ++i )
      lis.add ( sc.nextInt ( ) );
    
    n = sc.nextInt ( );
    for ( i = 0; i < n; ++i )
      if ( lis.contains ( sc.nextInt ( ) ) )
        ++res;
    
    System.out.println ( res );
    
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