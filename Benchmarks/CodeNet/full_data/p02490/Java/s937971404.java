public class
Main
{
  public void
  run (
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );

    for ( ; ; )
    {
      int a, b;
      
      a = sc.nextInt ( );
      b = sc.nextInt ( );
      if ( a == 0 && b == 0 )
        break ;
      
      if ( b < a )
        System.out.println ( b + " " + a );
      else
        System.out.println ( a + " " + b );
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