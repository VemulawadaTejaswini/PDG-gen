import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
		int[] d = new int[n];
		for (int i = n; i > 0; i--) {
			d[i] = sc.nextInt();
		}
		int ava = 0;
		for (int num: d) {
			ava = ava + num;
		}
		int hituyou = n * m;
		int e = hituyou - ava;
		if (e > k) {
			e = -1;
		} else if(e < 0) {
			e = 0;
		}
		System.out.println(e);
	}
}
