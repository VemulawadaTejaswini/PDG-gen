import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static public void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long[] array = new long[n];
		
		for(int i=0; i<n; i++) {
			array[i] = scan.nextLong();
		}
		
		long m = scan.nextLong();
		
		for(int i=0; i<m; i++) {
		
			int reaction = Arrays.binarySearch(array, scan.nextInt());
			System.out.println(reaction < 0 ? "0" : "1");
		}
	}
}
