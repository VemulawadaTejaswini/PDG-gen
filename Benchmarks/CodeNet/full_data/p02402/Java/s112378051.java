import java.util.Scanner;


class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);	
		double a[]=new double[10001];
		double min=1000000,max=-1000000,sum=0;
		int i=0;
		
		int n = kb.nextInt();
		while( 0<n-- ) {
			a[i]=kb.nextDouble();
			sum+=a[i];
			if( a[i] <= min ) {
				min=a[i];
			} 
			if( max <= a[i]  ) {
				max=a[i];
			} 
		}
		
		System.out.printf( "%.0f %.0f %.0f\n", min, max, sum );
		
	}
}