import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;i ++) {
			a[i] = sc.nextInt();
		}
		int[][] rest = new int[n][n];
		int[][] restrec = new int[n][n]; //使えるあまりのみ記録
		for(int i = 0;i < n;i++) {
			int cnt = 0;
			int idx = 0;
			for(int k = 0;k < n;k++) {
				if(a[i] < a[k]) {
					rest[i][k] = a[k] % a[i];
					if(rest[i][k] == 0) cnt++;
					else {
						restrec[i][idx] = rest[i][k];
						idx++;
					}
				}
				else rest[i][k] = -1;
			}
			if(cnt == n) {
				Arrays.sort(a);
				System.out.println(a[0]);
				return;
			}
		}
		int min = 1000000001;
		for(int i = 0;i < n;i ++) {
			for(int k = 0;k < restrec[i].length;k++) {
				if(Math.abs(a[i]-restrec[i][k]) < min) {
					min = Math.abs(a[i]-restrec[i][k]);
				}
			}
		}
		System.out.println(min);
	}
}