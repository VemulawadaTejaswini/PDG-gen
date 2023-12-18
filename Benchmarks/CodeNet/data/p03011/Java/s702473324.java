import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);

		int x = tc.nextInt();
		int soma = 0;
		int soma2 = 0;
		if (x % 2 != 0) {
			x += 1;
			int y[] = new int[x / 2];
			y[x / 2 - 1] = 0;
			int p[] = new int[x / 2];
			for (int i = 0; i < x - 1; i++) {
				if (i < x / 2)
					p[i] = tc.nextInt();
				else
					y[i] = tc.nextInt();
			}

			for (int i = 0; i < p.length; i++) {
				System.out.println(p[i]);
			}
		}
		else {
			
			int y[] = new int[x / 2];
			int p[] = new int[x / 2];
			for (int i = 0; i < x ; i++) {
				int t=0;
				if (i < x / 2 )
					p[i] = tc.nextInt();
				else {
					y[t] = tc.nextInt();
				t++;}
				}

			for (int i = 0; i < y.length; i++) {
				System.out.println(y[i]);
			}
			for (int i = 0; i < p.length; i++) {
				System.out.println(p[i]);
			}
		}
	}

}