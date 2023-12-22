package p0009;

public class
Main
{
  private static final int N = 999999; 

  public static void
  main (
    String[ ] args
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int[ ] p = new int[ N + 1 ];
    int i, j;
    
    for ( i = 2; i * i <= N; ++i )
    {
      if ( p[ i ] == 1 )
        continue ;
      for ( j = i * 2; j <= N; j += i )
        p[ j ] = 1;
    }
    for ( i = 2; i <= N; ++i )
      p[ i ] = p[ i - 1 ] + ( p[ i ] == 0 ? 1 : 0);
    
    while ( sc.hasNextInt ( ) )
    {
      int n;
      
      n = sc.nextInt ( );
      System.out.println ( p[ n ] );
    }
    
    return ;
  }
}