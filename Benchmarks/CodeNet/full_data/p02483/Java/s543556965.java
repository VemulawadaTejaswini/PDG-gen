public class
Main
{
  public void
  run (
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int d[ ] = new int[ 3 ];
    int i;
    
    for ( i = 0; i < d.length; ++i )
      d[ i ] = sc.nextInt ( );
    
    java.util.Arrays.sort ( d );
    for ( i = 0; i < d.length; ++i )
    {
      System.out.print ( d[ i ] );
      if ( i == d.length - 1 )
        System.out.println ( );
      else
        System.out.print ( " " );
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