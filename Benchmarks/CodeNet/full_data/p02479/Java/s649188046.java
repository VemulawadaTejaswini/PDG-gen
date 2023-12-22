public class
Main
{
  public void
  run (
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    double r;
      
    r = sc.nextDouble ( );
    System.out.println ( String.format ( "%.5f", r * r * Math.PI ) + " "
                       + String.format ( "%.5f", 2 * r * Math.PI ) );
    
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