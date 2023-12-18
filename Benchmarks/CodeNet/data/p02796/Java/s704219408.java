
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[][] list = new long[n][2];
		for (int i = 0; i < list.length; i++) {
			list[i][0] = sc.nextLong();
			list[i][1] = sc.nextLong();
		}
		
		long[][] list2 = new long[n][2];
		for (int i = 0; i < list2.length; i++) {
			list2[i][0] = list[i][0] - list[i][1];
			list2[i][1] = list[i][0] + list[i][1];
		}
		
		
		Arrays.sort(list2, (a, b) -> Long.compare(a[0], b[0]));
		
		
		long cnt = 0;
		for (int i = 0; i < list2.length - 1; i++) {
			int next = 0;
			for (int j = 1; j < list2.length; j++) {
				if (i + j >= n) {
					break;
				}
				if (list2[i][1] > list2[i + j][0]) {
					cnt++;
					next++;
					continue;
				} else {
					i += next;
					break;
				}
			}
		}
		
		System.out.println(n - cnt);
		
	}
}