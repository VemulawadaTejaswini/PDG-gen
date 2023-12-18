import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int asum = 0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			asum += a[i];
		}
		int msum = 0;
		for(int i=n-1; i<n-m; i--){
			msum += a[i];
		}
		System.out.println(msum < asum / 4 / m ? "Yes" : "No");
	}
}
