import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int D = sc.nextInt();
    	int N = sc.nextInt();
    	if (N <= 99) {
    		switch (D) {
    		case 0:
    			System.out.println(N);
    			break;
    		case 1:
    			System.out.println(100*N);
    			break;
    		case 2:
    			System.out.println(10000*N);
    			break;
    		}
    	} else {
    		switch (D) {
    		case 0:
    			System.out.println(101);
    			break;
    		case 1:
    			System.out.println(10100);
    			break;
    		case 2:
    			System.out.println(1010000);
    			break;
    		}
    	}
    }
}