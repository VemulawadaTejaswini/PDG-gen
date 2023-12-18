import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n+2];
		
		a[0] = 0;
		a[n+1] = 0;
		
		for(int i = 1; i <= n ; i++) {
			a[i] = sc.nextInt();
		}
		int []s1 = new int [n+1];
		int []s2 = new int [n];
		int sum = 0;
		
		for(int i = 0; i < n+1 ; i++) {
			s1[i] = Math.abs(a[i+1] -a[i]);
			sum += s1[i];
		}
		
		for(int i = 0; i < n ; i++) {
			s2[i] = Math.abs(a[i+2] - a[i]);
		}
		
		for(int i = 1 ; i <= n ; i++) {
			int ans = sum;
			ans = ans + s2[i-1] -(s1[i] + s1[i-1]);
			
			System.out.println(ans);
			
		}
		
		
	}

}
