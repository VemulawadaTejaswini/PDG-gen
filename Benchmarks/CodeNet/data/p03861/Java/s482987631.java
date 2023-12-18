import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		long a = 0;
		long b = 0;
		long x = 0;
		long count = 0;
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextLong();
		b = scan.nextLong();
		x = scan.nextLong();
		
		
		for(long i = a; i <= b; i++) {
			if(i % x == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}