import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] a = new long[n];
		int[] b = new int[n];
		int cheapest = 0;
		int number = 0;
		long answer = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextInt();
		}
		long[] c = a.clone();
		Arrays.sort(c);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(c[i] == a[j]) cheapest = j;
			}
			if(b[cheapest] + number < m) {
				number += b[cheapest];
				answer += a[cheapest] * b[cheapest];
			}
			else {
				answer += a[cheapest] * (m - number);
				break;
			}
		}
		System.out.println(answer);
	}

}
