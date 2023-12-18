import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[sc.nextInt()]++;
		}

		for (int i = 0; i < n; i++) {
			if (n % 2 == 0) {
				if (i % 2 != 0 && a[i] != 2) {
					System.out.println(0);
					return;
				}
			} else {
				if (i == 0 && a[i] != 1) {
					System.out.println(0);
					return;
				} else if (i != 0 && i % 2 == 0 && a[i] != 2) {
					System.out.println(0);
					return;
				}
			}
		}

		System.out.println(pow(2,(n / 2)));
	}

	static long pow(long a, int b){
		if(b == 1){
			return a;
		}else{
			long res = 1;
			if(b%2 == 1){
				res *= a;
			}
			long c = pow(a, b/2)%1000000007;
			return res = (c*c)%1000000007;
		}
	}
}