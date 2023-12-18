import java.util.*;
 
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      int X = Integer.parseInt(sc.next());
      
      int i = 0;
      int D = 0;
      while(D <= X && i < N) {
          D = D + Integer.parseInt(sc.next());
          i++;
      }
      if(D<=X)
	      System.out.println(X+1);
	  else
	      System.out.println(i);

      sc.close();
      
  }
}