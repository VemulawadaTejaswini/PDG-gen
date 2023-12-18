import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		long []b = new long [n+1];
		long sum = 0;
		
		for(int i = 0; i < n ;i++) {
			a[i] = sc.nextInt();
			}
		
		for(int i = 0 ; i < n-1 ; i++) {
			if(i % 2 == 0) {
				sum += a[i];
			}
			if(i % 2 == 1) {
				sum -= a[i];
			}
		}
		
		b[0] = a[n-1] + sum;
		
		for(int i = 0 ; i < n ;i++) {
			b[i+1] = 2*a[i] - b[i];
			System.out.print(b[i]+" ");
		}
		

	}

}
