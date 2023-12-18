import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		double[] a = new double[n];
		long sum = 0;
		for(int i=0; i<n; i++) {
		    a[i] = Double.parseDouble(sc.next());
		}
		
	    Arrays.sort(a);
		while(m > 0) {
		    a[n-1] /= 2;
		    m--;
		    Arrays.sort(a);
		}
		
		for(int i=0; i<n; i++) {
		    sum += (long)a[i];
		}
		System.out.println(sum);
	}
	
}