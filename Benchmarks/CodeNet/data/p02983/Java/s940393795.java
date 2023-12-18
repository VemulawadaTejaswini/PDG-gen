import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  int L = scan.nextInt();
	  int R = scan.nextInt();
	  int min = 2000000000;
	  int j = 1000000;
	  for( int i = L; i < j;i++ ) {
		  for( j = i + 1; j <= R;j++ ) {
			  int num = ( i * j ) % 2019;
			  if( min > num )min = num;
		  }
	  }
	  System.out.println(min);
  }
}

