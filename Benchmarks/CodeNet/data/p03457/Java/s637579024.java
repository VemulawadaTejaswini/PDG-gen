

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int prex = 0, prey = 0, pret = 0;
		int nStep = in.nextInt();
		while(0 != nStep--) {
			int t = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			if(Math.abs(x - prex) + Math.abs(y - prey) > t - pret) {
				System.out.println("No");
				return;
			}
			if((Math.abs(x - prex) + Math.abs(y - prey)) % 2 != (t - pret) % 2) {
				System.out.println("No");
				return;
			}
			prex = x; prey = y; pret = t;
		}
		System.out.println("Yes");
	}

}
