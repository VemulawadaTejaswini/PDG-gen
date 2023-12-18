import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  int X = Integer.parseInt(sc.next());
	  
	  int i = 0;
	  int D = 0;
	  while(D <= X) {
		  D = D + Integer.parseInt(sc.next());
		  i++;
	  }
	  System.out.println(i);
	  sc.close();
	  
  }
}