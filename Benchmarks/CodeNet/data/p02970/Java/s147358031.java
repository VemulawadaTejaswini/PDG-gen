
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		
        Scanner s = new Scanner (System.in);
        double n = s.nextInt();
        double d = s.nextInt();
        
        System.out.println((int) Math.ceil(n / (2 * d + 1)));
	}
}