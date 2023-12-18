import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int X = sc.nextInt();
    	for (int i = X; 0 < X; i--) {
    		double root = Math.sqrt(i);
    		double ceil = Math.ceil(root);
    		if (root == ceil) {
    			System.out.println(i);
    			break;
    		}
    	}
    }
}