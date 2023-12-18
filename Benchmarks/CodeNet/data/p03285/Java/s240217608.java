import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  int N = scan.nextInt();
	  boolean isJustBuy = false;
	  for( int i = 0; i <= N / 4; i++ ) {
		  for( int j = 0; j <= N / 7; j++ ) {
			  if( 4 * i + 7 * j == N ) {
				  isJustBuy = true;
				  break;
			  }
		  }
	  }
	  if( isJustBuy ) {
		  System.out.println( "Yes" );
	  }else{
		  System.out.println( "No" );
	  }
  }
}