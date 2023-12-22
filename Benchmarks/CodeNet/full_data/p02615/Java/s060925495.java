import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long result = a[n-1];
		for(int i=n-2; 0<i; i--){
			result += a[i] < a[i+1] ? a[i] : a[i+1];
		}
		System.out.println(result);
	}
}
