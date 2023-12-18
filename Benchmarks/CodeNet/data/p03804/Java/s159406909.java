
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] a = new String[n];
		String[] b = new String[m];
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		for(int i =0; i < m; i++) {
			b[i] = sc.next();
		}
		String result = "初期化";
out:		for(int i = 0;i <= n-m; i++) {
			int idx = a[i].indexOf(b[0]);
			if(idx != -1) {
				for(int j = 1; j <= m-1; j++) {
					System.out.println(i + " " + idx + " " + a[i + j].indexOf(b[j]) );
					if(a[i + j].indexOf(b[j]) == idx);
					else break;
					if(j == m-1) {
						result = "Yes";
						break out;
					}
				}
				
			}
			if(i == n-m) {
				result = "No";
			}
		}
		System.out.println(result);
	}
}
