
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int ans = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = m+i;
			sum += a[i];
		}
		for(int i = 0; i < n; i++) {
			if(a[i] == 0) {
				ans = sum;
				break;
			}
		}
		if(a[0] > 0) {
			ans = sum-a[0];
		}else if(a[n-1] < 0) {
			ans = sum - a[n-1];
		}
		System.out.println(ans);
		sc.close();
	}


}
