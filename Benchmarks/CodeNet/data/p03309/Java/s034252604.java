import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		long sum = 0;
		
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			a[i] = a[i] - i - 1 ;
			sum += a[i];
		}
		
		double ave = Math.floor((double)sum/n);
		long ans = 0;
		
		for(int i = 0; i < n ; i++) {
			ans += Math.abs(a[i] - (long)ave);
		}
		System.out.println(ans);

	}

}
