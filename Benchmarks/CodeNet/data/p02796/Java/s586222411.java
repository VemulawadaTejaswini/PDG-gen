
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] list = new int[n][2];
		for (int i = 0; i < list.length; i++) {
			list[i][0] = sc.nextInt();
			list[i][1] = sc.nextInt();
		}
		
		int[][] list2 = new int[n][2];
		for (int i = 0; i < list2.length; i++) {
			list2[i][0] = list[i][0] - list[i][1];
			list2[i][1] = list[i][0] + list[i][1];
		}
		
		
		Arrays.sort(list2, (a, b) -> Integer.compare(a[0], b[0]));
		
		
		int cnt = 0;
		for (int i = 0; i < list2.length - 1; i++) {
			for (int j = 1; j < list2.length; j++) {
				if (i + j >= n) {
					break;
				}
				if (list2[i][1] > list2[i + j][0]) {
					cnt++;
					continue;
				} else {
					i += cnt;
					break;
				}
			}
		}
		
		System.out.println(n - cnt);
		
	}
}