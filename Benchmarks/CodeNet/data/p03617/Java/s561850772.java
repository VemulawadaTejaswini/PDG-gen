import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long Q = sc.nextLong();
    	long H = sc.nextLong();
    	long S = sc.nextLong();
    	long D = sc.nextLong();
    	long N = sc.nextLong();
    	long Litre = Math.min(S, Math.min(4*Q, 2*H));
    	if (2*Litre < D) {
    		System.out.println(N*Litre);
    	} else {
    		System.out.println(N/2 * D + N%2 * Litre);
    	}
    }
}