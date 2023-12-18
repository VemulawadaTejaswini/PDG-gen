import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
      
      for(int i =1; i <b-a ;i++){
		sum += i;
      }
      
      System.out.print(sum-a);
      
	}
}
