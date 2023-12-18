import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		float ans = 0;
		for(int i = 0; i < n; i++) {
			ans += 1.0 / a[i];
//			System.out.println(ans);
		}
		
//		System.out.println(Arrays.toString(a));
		System.out.println(1 / ans);
	}
}
