import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		long a = in.nextInt();
		long fivehand = 0;
		long five = 0;
		
		fivehand = (a/500)*1000;
		five = ((a%500)/5)*5;
		
		System.out.println(fivehand + five);
      
	}
}