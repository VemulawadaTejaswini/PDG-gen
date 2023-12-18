    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		int x=Integer.parseInt(scan.next());
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		int n=(x-a)/b;
    		
    		System.out.print(x-a-(n*b));
 
     
    }
    }
// end 