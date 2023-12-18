
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, k, a[], b[], ans[], count[];
		n = sc.nextInt();
		k = sc.nextInt();
		
		a = new int[n];
		b = new int[n];
		ans = new int[n];
		count = new int[(int)Math.pow(10,  5) + 1];
		
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			ans[i] = a[i];
			count[a[i]] = b[i];
		}
		
		sc.close();
		
		Arrays.sort(ans);
		int tmp = ans[0];
		int sum = 0;
		
		for(int i = 0; i < n; ++i) {
			sum += count[ans[i]];
			if(sum >= k) tmp = ans[i];
		}
		
		System.out.println(tmp);
	}

}
