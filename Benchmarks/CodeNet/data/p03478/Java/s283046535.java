import java.util.Scanner;
public class sisaku {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(),  b = sc.nextInt();
		int dsum = 0, sum = 0;
		for(int i = 0; i <= n; i++) {
			int m = i;
			int val = String.valueOf(i).length();
			for(int k = val - 1; k >= 0; k--) {
				int d = (int) (m / Math.pow(10, k));
				int r = (int) (m % Math.pow(10, k));
				dsum+=d;
				m = r;
			}
			System.out.println(dsum);
			if(a <= dsum && dsum <= b) {
				sum+=i;
			}
			dsum = 0;
		}
		System.out.println(sum);
		sc.close();
	}
}