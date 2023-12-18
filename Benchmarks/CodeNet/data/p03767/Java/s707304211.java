
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		//input
		Scanner scan = new Scanner(System.in);
		int n = 3*Integer.parseInt(scan.next());
		long a[] = new long[n];
		
		for(int i = 0; i < n; i ++){
			a[i] = Integer.parseInt(scan.next());
		}
		
		scan.close();
		
		
		Arrays.sort(a);
		
		long res = 0;
		
		for(int i = n/3; i <=2*n/3-1; i++ ){
			res += a[i];
		}
		
		//output
		System.out.println(res);
	}
}