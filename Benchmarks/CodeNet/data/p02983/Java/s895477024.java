import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  long L = scan.nextInt();
	  long R = scan.nextInt();
	  long i;
	  long j = R;
	  long cnt = 0;
	  long min = ((R - 1) * R) % 2019;
	  for( i = L; i < R;i++ ) {
		  for( j = L + 1;j <= R && j < L + 2019;j++ ) {
			  //cnt++;
			  if(L <= i && i < j && j <= R) {
				  long num = ( i * j ) % 2019;
				  if( min > num )min = num;
			  }
		  }
	  }
	  System.out.println(min);
	  //System.out.println("処理回数は" + cnt);
  }
}

