import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int length = s.length;
		int i = 0;

		while(i < length) {

			int r = 0;
			while(i<length && s[i] == 'R') {
				r++;
				i++;
			}

			int l = 0;
			while(i<length && s[i] == 'L') {
				l++;
				i++;
			}

			int R , L;
			R = (int)Math.ceil(r/2.0);
			L = (int)(r/2.0);

			R += (int)(l/2.0);
			L += (int)Math.ceil(l/2.0);

			for(int j = 1; j < r; j++)
				System.out.println(0);
			System.out.println(R);
			System.out.println(L);
			for(int j = 1; j < l; j++)
				System.out.println(0);
		}

	}
}