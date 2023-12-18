import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  int N = scan.nextInt();
	  int M = scan.nextInt();
	  int[] P = new int[M];
	  int[] Y = new int[M];
	  int[] P_copy = new int[M];
	  int[] Y_copy = new int[M];
	  for( int i = 0; i < M; i++ ) {
		  P[i] = scan.nextInt();
		  Y[i] = scan.nextInt();
	  }
	  for( int i = 0; i < M; i++ ) {
		  P_copy[i] = P[i];
		  Y_copy[i] = Y[i];
	  }
	  for( int i = 0; i < M - 1; i++ ) {
		  for( int j = i + 1; j < M; j++ ) {
			  int p_tmp;
			  int y_tmp;
			  if( P_copy[i] > P_copy[j] ) {
				  p_tmp = P_copy[i];
				  P_copy[i] = P_copy[j];
				  P_copy[j] = p_tmp;
				  y_tmp = Y_copy[i];
				  Y_copy[i] = Y_copy[j];
				  Y_copy[j] = y_tmp;
			  }
		  }
	  }
	  for( int i = 0; i < M - 1; i++ ) {
		  for( int j = i + 1; j < M; j++ ) {
			  int p_tmp;
			  int y_tmp;
			  if( Y_copy[i] > Y_copy[j] && P_copy[i] == P_copy[j] ) {
				  p_tmp = P_copy[i];
				  P_copy[i] = P_copy[j];
				  P_copy[j] = p_tmp;
				  y_tmp = Y_copy[i];
				  Y_copy[i] = Y_copy[j];
				  Y_copy[j] = y_tmp;
			  }
		  }
	  }
	  String[] ans = new String[M];
	  for( int i = 0; i < ans.length; i++ )ans[i] = "";
	  int x = 1;
	  int tmp = 0;
	  for( int i = 0; i < M; i++ ) {
		  if( tmp != P_copy[i] ) {
			  tmp = P_copy[i];
			  x = 1;
		  }
		  int digit1 = 1;
		  int digit2 = 1;
		  int division = 10;
		  for( int j = 0; j < M; j++ ) {
			  while( true ) {
				  if( P_copy[i] / division > 0 ) {
					  digit1++;
					  division *= 10;
				  }else {
					  division = 10;
					  break;
				  }
			  }
			  while( true ) {
				  if( x / division > 0 ) {
					  digit2++;
					  division *= 10;
				  }else {
					  division = 10;
					  break;
				  }
			  }
			  if( P_copy[i] == P[j] && Y_copy[i] == Y[j] ) {
				  for( int k = 0; k < 6 - digit1; k++ )ans[j] += "0";
				  ans[j] += P_copy[i];
				  for( int k = 0; k < 6 - digit2; k++ )ans[j] += "0";
				  ans[j] += x;
				  x++;
				  break;
			  }
		  }
	  }
	  for( int i = 0; i < M; i++ ) {
		  System.out.println( ans[i] );
	  }
  }
}