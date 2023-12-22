

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();
		sc.close();


		if(a < b) {

			for(int i=0; i<t; i++) {
				a += v;
				b += w;
				if(a >= b) {
					System.out.println("YES");
					return;
				}
			}
			System.out.println("NO");

		}else {

			for(int i=0; i<t; i++) {
				a -= v;
				b -= w;
				if(a <= b) {
					System.out.println("YES");
					return;
				}
			}
			System.out.println("NO");

		}





	}

}
