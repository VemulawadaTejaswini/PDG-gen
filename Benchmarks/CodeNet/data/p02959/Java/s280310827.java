import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int[] a = new int[n+1];
			int[] b = new int[n];
			
			for(int i = 0 ; i < n+1; i++ ) {
				a[i] = sc.nextInt();
			}
			for(int i = 0 ; i < n ; i++ ) {
				b[i] = sc.nextInt();
			}
			
			int count = 0;
			for(int j = 0 ; j < n ; j++ ) {
				//latest hero
				if ( a[n-j] <= b[n-j-1] ) {
					count += a[n-j];
					int rest = b[n-j-1] - a[n-j];
					if ( a[n-j-1] <= rest ) {
						count += a[n-j-1];
						a[n-j-1] = 0;
						
					}
					else {
						a[n-j-1] = a[n-j-1] - rest;
						count += rest;
					}
				}
				else {
					count += b[n-j-1];
				}
			}
			
			System.out.println(count);
		}
	}
}