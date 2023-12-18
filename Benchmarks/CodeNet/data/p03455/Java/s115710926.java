import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1 * n2 % 2 == 0) {
        	System.out.println("Even");
        } else {
        	System.out.println("Odd");
        }
    }
}