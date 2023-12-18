import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  long N = scan.nextLong();
	  long moveCnt = ( N - 1 ) * ( N - 1 );
	  for( int i = 1;i <= Math.sqrt(N);i++ ) {
		  if( N % i == 0 ) {
			  for( int j = 1;j <= Math.sqrt(N);j++ ) {
				  //System.out.println("処理中…");
				  if( i * j == N && ( i - 1 ) + ( j - 1 ) < moveCnt ) {
					  moveCnt = ( i - 1 ) + ( j - 1 );
				  }
			  }
		  }
	  }
	  System.out.println(moveCnt);
  }
}

