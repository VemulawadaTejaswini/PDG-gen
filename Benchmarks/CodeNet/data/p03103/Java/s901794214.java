import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int b[] = new int[n];
		int a[] = new int[n];
		int tmpa[] = new int[n];
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			tmpa[i] = a[i];
			b[i] = sc.nextInt();
		}
		sc.close();
		int b2[] = new int[n];
		Arrays.sort(tmpa);
		for(int i = 0; i < n; ++i) {
			int t = Arrays.binarySearch(tmpa,  a[i]);
			if(t >= 0) {
				if(b2[t] == 0)
				b2[t] = i + 1;
				else {
					int tmp = t;
					for(int j = t - 1; j >= 0; --j) {
						if(b[j] == b[t] && b2[j] == 0)t = j;
						else break;
					}
					if(t == tmp) {
						for(int j = t + 1; j < n; ++j) {
							if(b[j] == b[t] && b2[j] == 0)t = j;
							else break;
						}
					}
					b2[t] = i + 1;
				}
			}
		}
		long ans = 0, count = 0, tmp = 0;
		for(int i = 0; i < n; ++i) {
			tmp = (long)b[b2[i] - 1];
			if(count + tmp >= m)tmp = m - count;
			count += tmp;
			ans += (long)tmpa[i] * tmp;
			if(count >= m)break;
		}
		System.out.println(ans);
		
	}

}
