import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long[] a = new long[5];
		
		long n = s.nextLong();
		
		a[0] = s.nextLong();
		a[1] = s.nextLong();
		a[2] = s.nextLong();
		a[3] = s.nextLong();
		a[4] = s.nextLong();
		
		long min = a[0];
		for (int i=0; i < 5 ; i++ ) {
			min = Math.min(min, a[i]);
		}
		if(min >= n) {
			System.out.println(5);
			return;
		}
		long neck = ( n + min - 1) / min;
		

		System.out.println (neck + 4);
		
		s.close();
		
	}

}