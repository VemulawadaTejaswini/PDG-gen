import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int k = 0;
		
		boolean isInteger = false;
		if ((a + b) % 2 == 0) {
			k = (a + b) / 2;
			isInteger = true;
		}
		
		int absA = 0;
		int absB = 0;
		boolean isEqual = false;
		if (isInteger) {
			absA = Math.abs(a-k);
			absB = Math.abs(b-k);
			if (absA == absB) isEqual = true;
		}
		
		if (isEqual) {
			System.out.println(k);
		} else {
			System.out.println("INPOSSIBLE");
		}
	}
}