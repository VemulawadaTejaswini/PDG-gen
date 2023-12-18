import java.util.*;

public class Main {

  public static void main(String args[]) {
    int rep = 1;
    if( args.length > 0 ) { rep = Integer.parseInt(args[0]); }
    (new Main()).__solve(rep);
  }

  void __solve(int rep) {

    try (
      Scanner cin = new Scanner(System.in);
    ) {

      for( int i = 0; i < rep; ++i ) {
        __solve(cin);
      }

    }

  }

  void __solve(Scanner cin) {
	  
	  int N = cin.nextInt();
	  int array[] = new int[N];
	  
	  for( int i = 0; i < N; ++i ) {
		  array[i] = cin.nextInt();
	  }
	  
	  int L = 0;
	  int sum = 0;
	  int ret = 0;
	  
	  for( int R = 0; R < N; ++R ) {
		  // no conflict;
		  if( (sum & array[R]) != 0 ) {
			  do {
				  sum ^= array[L++];
			  } while( (sum & array[R]) != 0 );
		  }
		  sum ^= array[R];
		  ret += (R - L + 1);
	  }
	  
	  System.out.println(ret);

  }

}
