import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] v = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			int b = sc.nextInt();
			for(int j=0;j<n;j++) {
				if (a[j] <= b) {
					v[j]++;
					break;
				}
			}
		}
		int maxi = -1;
		int max = 0;
		for(int i=0;i<n;i++) {
			if (v[i] > max) {
				maxi = i;
				max = v[i];
			}
		}
		System.out.println(maxi + 1);
	}

}