import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextInt();		
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdin.nextLong();
		}
		
		long min = a[0];
		for (int j = 1; j < a.length; j++) {
	        if (a[j]<min) {
	        	min = a[j];
	        }
	    }
		
		long max = a[0];
		for (int i = 1; i < a.length; i++) {
	        if (a[i]>max) {
	        	max = a[i];
	        }
	    }
		
		long sum = a[0];
		for (int i = 1; i < a.length; i++) {	       
	        	sum += a[i];
	    }
		
		System.out.println( min+ " " + max + " " + sum );
	}
}