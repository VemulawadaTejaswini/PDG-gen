import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v1[] = new int[n / 2];
		int v2[] = new int[n / 2];
		for (int i = 0; i < n / 2; i++) {
			v1[i] = sc.nextInt();
			v2[i] = sc.nextInt();
		}

		Arrays.sort(v1);
		Arrays.sort(v2);
		int p = 1;
		for (int i = 0; i < (n / 2) - 1; i++) {
			if (v1[i] != v1[i + 1]) {
				p++;
			}
		}
		int x1[] = new int[p];
		p = 1;
		for (int i = 0; i < (n / 2) - 1; i++) {
			if (v2[i] != v2[i + 1]) {
				p++;
			}
		}
		int x2[] = new int[p];
		Renzoku(v1, x1);
		Renzoku(v2, x2);

		Arrays.sort(x1);
		Arrays.sort(x2);
		int ans=sum(x1)+sum(x2)-x1[x1.length-1]-x2[x2.length-1];

		if(ans==0&&v1[0]==v2[0]){
		System.out.println(n/2);
		}else{

		System.out.println(ans);
	}}

	public static int Renzoku(int c[], int x[]) {

		int mode = 0;
		int val = 0;

		for (int i = 0; i <= c.length - 2; i++) {
			if ((c[i] == c[i + 1]) && i != c.length - 2) {
				val++;
			} else {
				if ((c[i] == c[i + 1]) && i == c.length - 2) {
					val++;
				}
				val++;
				x[mode] = val;
				mode++;

				if ((c[i] != c[i + 1]) && i == c.length - 2) {
					x[mode] = 1;
					mode++;
				}

				val = 0;
			}

		}
		return mode;

	}

	static int sum(int a[]) {
		int n = a.length;
		int ans = 0;
		for (int i =0; i <= n - 1; i++) {
			ans += a[i];
		}
		return ans;
	}

}