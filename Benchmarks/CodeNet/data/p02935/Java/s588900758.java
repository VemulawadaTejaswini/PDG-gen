import java.util.Arrays;
import java.util.Scanner;

class Main {

	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		Arrays.sort(a);
		double sum = (a[0]+a[1])/2.0;
		for(int i=2;i<n;i++) {
			
			sum = (sum+a[i])/2;
		}
		System.out.println(sum);
		
		
		
		
	}
}
