
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(n % 2 == 1) {
			int low = a[(n-1)/2];
			int high = b[(n-1)/2];
			System.out.println(high - low +1);
		}
		else {
			int low = a[(n-2)/2] +a[n/2];
			int high = b[(n-2)/2] +b[n/2];
			System.out.println(high - low + 1);
		}
	}
}
