import java.math.BigInteger;

public class
Main
{

  public static void
  main (
    String[ ] args
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int n;
    int i;
    
    n = sc.nextInt ( );
    for ( i = 0; i < n; ++i )
    {
      BigInteger r;
      
      r = sc.nextBigInteger ( );
      r = r.add ( sc.nextBigInteger ( ) );

      if ( r.compareTo ( new BigInteger ( "100000000000000000000000000000000000000000000000000000000000000000000000000000000" ) ) >= 0 )
        System.out.println ( "overflow" );
      else
        System.out.println ( r );
    }
    
    return ;
  }
  
}