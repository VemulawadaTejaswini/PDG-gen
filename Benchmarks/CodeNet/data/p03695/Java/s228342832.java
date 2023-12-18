import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] cnt = new int[8];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			if(1 <= a[i] && a[i] <= 399) cnt[0]++;
			else if(400 <= a[i] && a[i] <= 799) cnt[1]++;
			else if(800 <= a[i] && a[i] <= 1199) cnt[2]++;
			else if(1200 <= a[i] && a[i] <= 1599) cnt[3]++;
			else if(1600 <= a[i] && a[i] <= 1999) cnt[4]++;
			else if(2000 <= a[i] && a[i] <= 2399) cnt[5]++;
			else if(2400 <= a[i] && a[i] <= 2799) cnt[6]++;
			else if(2800 <= a[i] && a[i] <= 3199) cnt[7]++;
		}
		int min = 0;
		int max = 0;
		int cntj = 0;
		int[] cnt1 = Arrays.copyOf(cnt, 8);
		for(int i = 0 ; i < n ; i++) {
			int cntmin = 0;
			if(a[i] >= 3200) {
				// 最大値を求める
				for(int j = 0 ; j < 8 ; j++) {
					if(cnt[j] == 0) {
						cnt[j]++;
						break;
					}
				}
				// 最小値を求める
				for(int j = 0 ; j < 8 ; j++) {
					cntmin++;
					if(cnt1[j] != 0) {
						cnt1[j]++;
						break;
					}
					if(cntmin == 8) {
						cnt[cntj]++;
						cntj++;
					}
				}
			}
		}
		for(int i = 0 ; i < 8 ; i++) {
			if(cnt[i] >= 1) {
				max++;
			}
			if(cnt1[i] >= 1) {
				min++;
			}
		}
		System.out.println(min + " " + max);
	}
}
