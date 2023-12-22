public class
Main
{
  public void
  run (
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    java.util.Stack<Integer> lis = new java.util.Stack<Integer> ( );
    int n;
    int i;
    
    n = sc.nextInt ( );
    for ( i = 0; i < n; ++i )
      lis.push ( sc.nextInt ( ) );
    
    for ( ; ; )
    {
      System.out.print ( lis.pop ( ) );
      if ( lis.isEmpty ( ) )
        break ;
      System.out.print ( " " );
    }
    System.out.println ( );
      
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