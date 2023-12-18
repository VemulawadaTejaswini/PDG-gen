import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double n = sc.nextLong();
		 double[]m = new double[5];
	    
		 for(int i=0; i<5; i++) {
			  m[i] = sc.nextInt();
		  }
		  sc.close();
		  Arrays.sort(m);
		 long ans = (long)Math.ceil(n/m[0])+4;
		 
	  System.out.println(ans);
   }
}
