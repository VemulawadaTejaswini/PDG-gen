import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int A = Integer.parseInt(sc.next());
	  int B = Integer.parseInt(sc.next());
	 
	  int count = 1;
	  int temp = A;
	  while(temp < B) {
		  temp += temp -1;
		  count++;
	  }
	  System.out.println(count);
	  sc.close();
	  
  }
}
