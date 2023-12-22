import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n, i, j, factorial, k, m;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			factorial = (int) (Math.pow(2, n));
			k = sc.nextInt();
			int[] b = new int[n];
			int[] a = new int[n];
			for(i = 0; i < k; i++) {
				b[sc.nextInt()] = 1;
			}
			for(i = 0; i < factorial; i++) {
				m = i;
				for(j = 0; m != 0; j++) {
					if(m % 2 == 1) {
						a[j] = 1;
					}else {
						a[j] = 0;
					}
					m /= 2;
				}
				boolean bool = false;
				for(j = 0; j < n; j++) {
					if(b[j] == 0 && a[j] == 1) {
						bool = true;
						break;
					}
				}
				if(bool) continue;
				System.out.print(i + ":");
				for(j = 0; j < a.length; j++) {
					if(a[j] == 1) {
						System.out.print(" " + j);
					}
				}
				System.out.println();

			}
		}
	}
}
