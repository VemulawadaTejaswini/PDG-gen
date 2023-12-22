import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];

		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
		}
      
		long ans = a[0];
      
		for(int i = 1; i < n; i++){
			ans *= a[i];
		}
		
		if(ans > 1e18)
			System.out.println(-1);
		else
			System.out.println(ans);
	}
}
