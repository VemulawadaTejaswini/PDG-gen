import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			double a = stdIn.nextDouble();
			double y = 4.9*(a/9.8)*(a/9.8);
			
			System.out.println((int)Math.ceil((y + 5.0)/5.0));
		}
		
	}
}