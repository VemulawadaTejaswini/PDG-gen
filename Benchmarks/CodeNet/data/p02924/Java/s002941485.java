import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		long Nam = in.nextInt();
      	long sum = 0;
      
      sum = ((Nam)*(Nam-1))/2;

     System.out.print(sum);
	}
}