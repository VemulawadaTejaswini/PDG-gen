public class
Main
{
  public static int
  gcd (
    int a,
    int b
    )
  {
    if ( a == 0 ) return ( b );

    return
    gcd ( b % a, a );
  }

  public static void
  main (
    String[ ] args
    )
  {
    java.util.Scanner cin = new java.util.Scanner ( System.in );

    while ( cin.hasNext ( ) )
    {
      int a, b;

      a = cin.nextInt ( ); b = cin.nextInt ( );
      System.out.println ( gcd ( a, b ) + " " + a / gcd ( a, b ) * b );
    }

    return ;
  }
}