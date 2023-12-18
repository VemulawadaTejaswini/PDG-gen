
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long s = Long.parseLong(sc.next());
		
		long []x = new long [3];
		long []y = new long [3];
		
		x[0] = y[0] = 0;
		x[1] = 1;
		y[1] = 1000000000;
		
		x[2] = -(s % y[1]);
		y[2] = (s/y[1]);
		
		System.out.println(x[0]+" "+y[0]+" "+x[1]+" "+y[1]+" "+x[2]+" "+y[2]);

	}
}