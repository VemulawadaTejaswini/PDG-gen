import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int result = 0;
	        if(a>=k || a+b>=k) {
	        	result = k;
	        }else  {
	        	int d = k-a-b;
	        	result = k-d;
	        }
	        System.out.println(result); 
	        
            

          
	        
            //System.out.println(res); 
	        
	}
}