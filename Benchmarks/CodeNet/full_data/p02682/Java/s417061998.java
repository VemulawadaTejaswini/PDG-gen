import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int result = 0;
	        if(k<a) {
	        	result = k;
	        }else if(k>=a && a+b>=k) {
	        	result = a;
	        }else  {
	        	int d = k-a-b;
	        	result = a-d;
	        }
	        System.out.println(result); 
	        
            

          
	        
            //System.out.println(res); 
	        
	}
}