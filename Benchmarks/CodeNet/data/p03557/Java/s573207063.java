

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			c[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		int answer = 0;
		int startK = 0;

		for(int i=0; i<n; i++) {
			startK = 0;
			for(int j=0; j<n; j++) {
				if(a[i] < b[j]) {
					for(int k=startK; k<n; k++) {
						if(b[j] < c[k]) {
							answer += n-k;
							startK = k;
							break;
						}
					}
				}
			}
		}

		System.out.println(answer);

	}

}
