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
  
  String m[] = new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };

  void __solve(Scanner cin) {
	  String s = cin.next();
	  boolean f = false;
	  boolean t = false;
	  for( String M : m ) {
		  f |= s.substring(0, 2).equals(M);
		  t |= s.substring(2, 4).equals(M);
	  }
	  if( f && t ) {
		  System.out.println("AMBIGUOUS");
	  }
	  else if( f ) {
		  System.out.println("MMYY");
	  }
	  else if( t ) {
		  System.out.println("YYMM");
	  }
	  else {
		  System.out.println("NA");
	  }
  }

}
