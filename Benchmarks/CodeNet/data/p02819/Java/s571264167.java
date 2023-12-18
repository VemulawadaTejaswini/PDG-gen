import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x == 2) {
			System.out.println(2);
			return;
		}
		
		int idx = 0;
		int[] p = new int[100010];
		p[idx++] = 2;
		p[idx++] = 3;
		
		for (int n = 3; n <= 100009; n += 2) {
			boolean flg = false;
			for (int i = 1; p[i] * p[i] <= n; i++) {
				if (n % p[i] == 0) {
					flg = true;
					break;
				}
			}
			
			if (!flg) {
				p[idx++] = n;
				if (n >= x) {
					System.out.println(n);
					return;
				}
			}
		}
	}
}
