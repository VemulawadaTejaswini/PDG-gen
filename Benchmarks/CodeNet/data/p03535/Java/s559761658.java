import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n+1];
		num[0] = 0;
		for(int i = 0; i < n; i++) {
			num[i+1] = sc.nextInt();
		}
		Arrays.sort(num);
		int minWide_P = 0;
		int minWide = 24;
		int[] wide = new int[n];
		for(int i = 0; i < n; i++) {
			wide[i] = num[i+1] - num[i];
			if(wide[i] < minWide) {
				minWide = wide[i];
				minWide_P = i;
			}
		}

		if(n == 1) {
			System.out.println(wide[0]);
			return;
		}

		if(minWide_P == 0) {
			System.out.println(Math.min(wide[0]+wide[1], 24 - num[1] - num[n]));
		} else if(minWide_P == n - 1){
			System.out.println(Math.min(wide[minWide_P - 1] + wide[minWide_P], 24 - num[minWide_P] - num[n]));
		} else {
			int w1 = wide[minWide_P - 1];
			int w2 = wide[minWide_P + 1];

			int min;
			int max;
			if(w1 >= w2) {
				min = w2;
				max = w1;
				minWide_P++;
			} else {
				min = w1;
				max = w2;
				minWide_P = minWide_P;
			}

			if(minWide + min < max) {
				System.out.println(Math.min(minWide + min, 24 - num[minWide_P] - num[n]));
			} else {
				System.out.println(minWide);
			}
		}
	}
}