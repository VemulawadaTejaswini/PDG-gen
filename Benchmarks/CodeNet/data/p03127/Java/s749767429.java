
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int ans = a[0];
		for(int i = 1; i < n; i++){
			ans = gcd(ans, a[i]);
		}
		System.out.println(ans);
	}
	static int gcd(int a, int b){
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int next = max % min;
		if(next == 0){
			return min;
		}
		else{
			return gcd(min, next);
		}
	}
}
