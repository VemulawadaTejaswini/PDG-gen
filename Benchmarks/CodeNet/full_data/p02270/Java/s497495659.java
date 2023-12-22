
import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = in.nextInt();
		int w = 0;
		int p = 0;
		double totalw=0;
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
			totalw+=c[i];
			if (p < c[i]) {
				p = c[i];
			}
		}
		p=(int)Math.ceil(totalw/count);
		int t = 1;
		boolean flg = true;
		do {
			flg = true;
			t = 1;
			w = 0;

			for (int i = 0; i < n; i++) {
				if (w + c[i] > p) {
					t += 1;
					w = c[i];
				} else {
					w += c[i];
				}
				if (t > count) {
					p+=1;
					flg = false;
					break;
				}
			}


		}while(!flg);

		System.out.println(p);
		in.close();
	}

}

