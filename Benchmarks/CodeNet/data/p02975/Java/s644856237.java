
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] circle = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		boolean ans = false;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				circle[0] = a[i];
				circle[1] = a[j];
				List<Long> res = new ArrayList<>();
				for(int k = 0; k < n; k++) {
					if(k != i && k != j) {
						res.add(a[k]);
					}
				}
				int k = 2;
				for(k = 2; k < n; k++) {
					long tmp = a[k - 2] ^ a[k - 1];
					if(res.contains(tmp)) {
						a[k] = tmp;
						res.remove(tmp);
					} else {
						break;
					}
				}
				if(k == n) {
					ans = true;
					break;
				}
			}
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
