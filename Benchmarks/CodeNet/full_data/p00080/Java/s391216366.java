//Volume0-0080
import java.util.*;

public class Main {

	public static void main(String[] args) {

		//declare
		final int END = -1;
		double    q,x;

		//input
		Scanner sc = new Scanner(System.in);
		while((q = sc.nextDouble()) != END){
			
			//calculate
			x = q / 2;
			while(true){
				x = x - ((Math.pow(x,3) - q) / (3 * Math.pow(x,2)));
				if(Math.abs(Math.pow(x,3) - q) < 0.00001){
					break;
				}
			}
			
			//output
			System.out.println(x);
		}
	}
}