
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] agrs) {

	  Scanner a = new Scanner(new InputStreamReader(System.in));
	  double A = a.nextDouble();
	  double B = a.nextDouble();
	  char OP = a.next().charAt(0);
	  switch(OP) {
	  case('+'):
	      System.out.println(A+B);
	  break;
	  case('-'):
		  System.out.println(A-B);
	  break;
	  case('*'):
		  System.out.println(A*B);
	  break;
	  case('/'):
		  System.out.println(A/B);
      break;
	  case('?'):
		  System.out.println("\t");

	  }
	  a.close();

  }
}

