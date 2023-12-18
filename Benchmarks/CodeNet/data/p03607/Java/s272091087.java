import java.util.*;

public class Main {

	static int MAX = 1000000001;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, ans = 0;
		boolean a[] = new boolean[MAX];
		n = sc.nextInt();
		for(int i = 0; i < n; ++i) {
			int tmp = sc.nextInt();
			if(a[tmp]) {
				a[tmp] = false;
				--ans;
			}
			else {
				a[tmp] = true;
				ans ++;
			}
		}
		sc.close();
			System.out.println(ans);
	}

}
