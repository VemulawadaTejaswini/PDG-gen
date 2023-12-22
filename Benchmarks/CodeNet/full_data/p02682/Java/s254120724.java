import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long k = sc.nextLong();
			
			long point = 0;
			
			if ( k <= a ) {
				point = k;
			}
			else if ( k <= a + b ) {
				point = a;
			}
			else if ( k <= a + b + c) {
				point = a - (k - a - b);
			}
			
			System.out.println(point);
		}
	}

}