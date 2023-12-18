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
	  int K = cin.nextInt();
	  double ans = 0.0;
	  double d = 1.0 / N;
	  for( int i = 1; i <= N; ++i ) {
		  double tmp = 1.0 / N;
		  int I = i;
		  while( I < K ) {
			  tmp /= 2.0;
			  I *= 2;
		  }
		  ans += tmp;
	  }
	  System.out.println(ans);
  }

}
