import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int[] a = new int[n];

		for(int i = 0;i < n; i++) {
			a[i] = s.charAt(i) - '0';
		}

		char[] c = new char[n-1];

		for ( int bit = 0; bit < (1 << n); bit ++){

			int sum = a[0];

			for ( int j = 0; j < n-1; j++){

				if ( (bit >> j & 1) == 1){
					sum += a[j+1];
					c[j] = '+';

				} else {
					sum -= a[j+1];
					c[j] = '-';
				}

			}

			if (sum == 7){
				for ( int k = 0; k < n; k++){
					if ( k == n -1){
						System.out.print(a[k]);
					} else {
						System.out.print(a[k]);
						System.out.print(c[k]);
					}
				}
				System.out.println("=7");
				break;
			}

		}


	}

}
