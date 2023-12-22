import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n + 1];
		int[] c = new int[n + 1];
		int d = 0;
		for(int i = 0 ; i < n + 1 ; i++) {
			a[i] = sc.nextInt();
			if(i == 0 && a[i] != 0) {
				System.out.println(-1);
				return;
			}
		}
		for(int i = n ; i >= 0 ; i--) {
			if(i == n)
				b[i] = a[i];
			else {
				b[i] = b[i + 1] + a[i];
              
			}

		}
		for(int i = 0 ; i < n + 1 ; i++) {
			if(i == 0)
			c[i] = 1;
			else {
				c[i] = (c[i - 1] - a[i - 1]) * 2 ;
              if(c[i - 1] < a[i]){
				System.out.println(-1);
				return;
			}
				if(i != n) {
					if(c[i] - a[i] > b[i + 1]) {
					c[i] = b[i + 1] + a[i];
					}
				}
				else if(i == n) {                  
                   c[i] = a[i];

				}
			}
			d += c[i];

		}

			System.out.println(d);


	}

}
