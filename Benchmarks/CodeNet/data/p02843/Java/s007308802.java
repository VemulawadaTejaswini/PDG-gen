import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int X = sc.nextInt();
    	for (int i = 1; i <= 1000; i++) {
    		if (100 * i <= X && X <= 105 * i) {
    			System.out.println(1);
    			System.exit(0);
    		}
    	}
    	System.out.println(0);
    }
}