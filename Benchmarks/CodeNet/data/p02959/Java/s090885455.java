import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n];
		
		for(int i=0 ; i<n+1 ; i++) {
			 a[i] = sc.nextInt();
		}
		for(int i=0 ; i<n ; i++) {
			b[i] = sc.nextInt();
		}
		
		
		long z = 0;
		for (int j=0; j<n; j++) {
			int x = Math.min(a[j], b[j]);
			z += x;
			a[j] -=x;
			b[j] -=x;
			
			int y = Math.min(a[j+1], b[j]);
			z += y;
			a[j+1] -=y;
			b[j] -=y;
			
		}
		
		System.out.println(z);

	}

}
