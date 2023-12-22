import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean[] b = new boolean[n];
		for(int i = 0; i < n; i++) {
			a[i] =sc.nextInt();
			b[i] = true;
		}
		
		java.util.Arrays.sort(a);
		/*for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}*/
		if(a[0] == a[1]) {
			b[0] = false; 
		}
		for(int i = 0; i < n; i++) {
			for(int m = i+1; m < n; m++) {
				if(b[m]) {
					if(a[m] % a[i] == 0) {
						b[m] = false;
					}
				}
			}
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(b[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
