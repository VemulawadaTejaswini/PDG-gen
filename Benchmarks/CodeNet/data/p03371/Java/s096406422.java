
import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A  = scan.nextInt(), B = scan.nextInt(), C = scan.nextInt(), X = scan.nextInt(), Y= scan.nextInt();
		
		long a1 = (A*X)+(B*Y), a2 = (Integer.min(X, Y)*2*C);
		
		if(X< Y) {
			a2 = a2 + Long.min((long)((Y-X)*B), (long)((Y-X)*2*C));
		}else if(X>Y){
			a2 = a2 + Long.min((long)((X-Y)*A), (long)((X-Y)*2*C));
		}
		
		System.out.println(Long.min(a1, a2));
		
		
	}

}
