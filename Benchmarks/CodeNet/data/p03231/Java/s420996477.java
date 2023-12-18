import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextInt();

		long M = sc.nextInt();

		String S = sc.next();

		String T = sc.next();

		char[] s = new char[S.length()];

		char[] t = new char[T.length()];

		long gcd = 1;

		boolean flag = false;

		long c = 1;




		for(int i=0;i<S.length();i++) {

			s[i] = S.charAt(i);

		}

		for(int i=0;i<T.length();i++) {

			t[i] = T.charAt(i);

		}

		if(s[0] != t[0] ) {

			System.out.println(-1);

		}else if(S.equals(T)) {

			System.out.println(S.length());


		}else if(S.length() == T.length() && !S.equals(T)) {

			System.out.println(-1);

		}else {


			gcd = gcd(S.length(),T.length());


			long a = S.length() / gcd;

			long  b = T.length() / gcd;

			c = a * b * gcd;


			long  i = 1;

			long  e = a * b;



			while((e/a)<t.length  && (e/b)<s.length ) {


				if(t[(int)(e/a)] != s[(int)(e/b)]) {


					flag = true;

					break;
				}

				i++;

				e = (a * b) * i;



			}



			if(flag == false) {

				System.out.println(c);

			}else {

				System.out.println(-1);
			}


		}




	}

	public static long gcd(int a, int b) {

		if(b==0) return a;

		return gcd(b,a%b);
	}

}
