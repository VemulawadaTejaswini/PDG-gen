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
      char op;
      int a, b, r = 0;
      
      a = sc.nextInt ( );
      op = sc.next ( ).charAt ( 0 );
      b = sc.nextInt ( );
    
      if ( op == '?' )
        break ;
      
      switch ( op )
      {
        case '+': r = a + b; break ;
        case '-': r = a - b; break ;
        case '*': r = a * b; break ;
        case '/': r = a / b; break ;
      }
      System.out.println ( r );
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