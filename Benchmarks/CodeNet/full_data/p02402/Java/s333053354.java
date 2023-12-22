import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	static DecimalFormat df = new DecimalFormat("0.0000000000000000000");
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			min = Math.min(min, a);
			max = Math.max(max, a);
			sum += a;
		}
		
		System.out.println(min + " " + max + " " + sum);
		
		sc.close();
	}

}