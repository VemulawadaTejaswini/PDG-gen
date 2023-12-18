import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
	    if (b >= c) {
	    	System.out.println("delicious");
	    } else if (b < c && (c - b) <= a) {
	    	System.out.println("safe");
	    } else {
	    	System.out.println("dangerous");
	    }
	} 
}
