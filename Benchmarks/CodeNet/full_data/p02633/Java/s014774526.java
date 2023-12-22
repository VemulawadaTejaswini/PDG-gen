import java.util.*;

public class Contest200620 {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        boolean is360 = false;
	        int n = 1;
	        
	        while (!is360) 
	        	if (n*x % 360 != 0) {
	        		n++;
	        	}else {
	        		is360 = true;
	        	}
	        	
	        
	       
	        System.out.println(n);
	}
}