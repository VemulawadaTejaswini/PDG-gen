import java.util.Scanner;

public class Main {
	
	   

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        char c = sc.next().charAt(0);
	        
	        if(c>='A' && c<='Z'){
	            c+=32;
	           // System.out.println(c);
	        }
	       
	        
	        System.out.println(c);
	        
            //System.out.println(res); 
	        
	}
}