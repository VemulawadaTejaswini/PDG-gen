import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long D = sc.nextLong();
    	long N = sc.nextLong();
    	if (D == 1) {
    		System.out.println(100*N);
    	} else if (D == 2) {
    		System.out.println(10000*N);
    	} else {
    		if (N == 100) {
    			System.out.println(101);
    		} else {
        		System.out.println(N);
    		}
    	}
    }
}