import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] a = {sc.nextLong(), sc.nextLong(), sc.nextLong()};
		int ans = 0;
		for(int i = 0 ; i < 1000 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				if(a[j] % 2 == 1) {
					System.out.println(i);
					return;
				}
			}
			long x = (a[0] + a[1]) / 2;
			long y = (a[1] + a[2]) / 2;
			long z = (a[2] + a[0]) / 2;
			a[0] = y;
			a[1] = z;
			a[2] = x;
		}
		System.out.println(-1);
	}
}
