import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		
		System.out.println(Main.numOfdeviable(a, b, x));
		sc.close();
	}

	static int numOfdeviable(long a, long b, long x) {
		int count = 0;
		
		if ( x == 1) {
			for (long i = a; i <= b; i++)
				count++;
		}
		
		else {
			for (long i = a; i <= b; i++) {
				if ( i % x == 0)
					count++;
			}
		}
		
		return count;
	}
}
