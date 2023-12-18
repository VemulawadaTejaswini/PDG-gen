import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0 ; i < n ; i++) {
			int minBlueIndex = 300;
			int minBlueValue = 300;
			for(int j = 0 ; j < n ; j++) {
				if(minBlueValue > c[j] && c[j] != -1 && d[j] != -1) {
					minBlueIndex = j;
					minBlueValue = c[j];
				}
			}
			int maxRedIndex = -1;
			int maxRedValue = -1;
			for(int j = 0 ; j < n ; j++) {
				if(maxRedValue < b[j] && a[j] < c[minBlueIndex] && a[j] != -1 && b[j] != -1) {
					maxRedIndex = j;
					maxRedValue = b[j];
				}
			}
			if(maxRedIndex != -1) {
				a[maxRedIndex] = -1;
				b[maxRedIndex] = -1;
				c[minBlueIndex] = -1;
				d[minBlueIndex] = -1;
				ans++;
			} else {
				c[minBlueIndex] = -1;
				d[minBlueIndex] = -1;
			}
		}
		System.out.println(ans);
	}
}
