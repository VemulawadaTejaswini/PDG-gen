import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long a = Long.parseLong(scan.next());
		long b = Long.parseLong(scan.next());
		long k = Long.parseLong(scan.next());
		
		if((a < 0 || Math.pow(10, 12) < a) || (b < 0 || Math.pow(10, 12) < b) || (k < 0 || Math.pow(10, 12) < k)) {
			System.out.println("0 0");
		}
		
		for(long i = 0; i < k; i++) {
			if(a > 0) {
				a--;
			} else if (b > 0) {
				b--;
			}
		}
		System.out.println(a + " " + b);	
		
		scan.close();
	}
}