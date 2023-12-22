import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      
        long[] array = new long[n];
		for(int i = 0; i < array.length; ++i) {
    	array[i] = scan.nextLong();
		}
       
        long product = 1;
      
       for(int i = 0; i < array.length; i++) {
          	if (array[i] == 0) {
             System.out.println(0);
             System.exit(0); 
            }
        }
        
		
		for(int i = 0; i < array.length; i++) {
			product *= array[i];
          	if (product > 1_000_000_000_000_000_000L) {
             System.out.println("-1");
             System.exit(0); 
            }
        }
      	System.out.println(product);
    }
}
