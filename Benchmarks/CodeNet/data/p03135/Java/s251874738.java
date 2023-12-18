import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	
      	int T = Integer.parseInt(sc.next());
      	int X = Integer.parseInt(sc.next());
      
      	double t = (T * 1.0) / X;
      	
      	System.out.println(t);
    }
}