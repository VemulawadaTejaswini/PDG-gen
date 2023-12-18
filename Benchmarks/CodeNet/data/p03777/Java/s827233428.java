import java.util.*;

public class Main {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);              

       int X = Integer.parseInt(sc.next());

	int count = 0;
	int i = 1;
        
	while(X > 0) {
	    count++;
	    X -= i;
	    i++;
	}

	System.out.println(count);          
    
  }   
}