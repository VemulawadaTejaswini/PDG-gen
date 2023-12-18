import java.util.*;
 
public class Main {
	public static void main (String[] args) {
      
      Scanner in = new Scanner(System.in);
		int[] a = new int[32];
      
        for(int i = 0; i < a.length; i++){
          	a[i] = in.nextInt(); 
        }
		int k = in.nextInt();
		
      System.out.println(a[k-1]);
      
    }
}