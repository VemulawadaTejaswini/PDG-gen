    import java.util.*;
    public class Main{
    	
    	public static void main(String[] args) {
    		
    		Scanner scan = new Scanner(System.in);
    		
    		int A  = scan.nextInt(), B = scan.nextInt(), C = scan.nextInt(), X = scan.nextInt(), Y= scan.nextInt();
    		
    		int a1 = (A*X)+(B*Y), a2 = (Integer.min(X, Y)*2*C);
    		
    		if(X< Y) {
    			a2 = a2 + Integer.min((int)((Y-X)*B), (int)((Y-X)*2*C));
    		}else if(X>Y){
    			a2 = a2 + Integer.min((int)((X-Y)*A), (int)((X-Y)*2*C));
    		}
    		
    		System.out.println(Integer.min(a1, a2));
    		
    		
    	}
     
    }