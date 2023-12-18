import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int v[] = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		Arrays.sort(v);
		
		int ans = v[0];
//		System.out.println(ans);

		for(int i = 0; i < n; i++) {
			ans = (ans + v[i]) / 2;
//			System.out.println(ans);
		}
		
		System.out.println(ans);
	}
}