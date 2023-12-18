import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int M = sc.nextInt();

		String S = sc.next();

		String T = sc.next();

		char[] s = new char[S.length()];

		char[] t = new char[T.length()];

		int gcd = 1;

		boolean flag = false;

		int c = 1;




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

			int a = S.length() / gcd;

			int b = T.length() / gcd;

			c = a * b * gcd;



			int i = 1;

			int e = a * b;



			while((e/a)<=t.length -1 && (e/b)<=s.length -1) {


				if(t[(e/a)] != s[(e/b)]) {


					flag = true;

					break;
				}

				i++;

				e = (a * b) * i;



			}

			//if(S.length() == T.length() && s[s.length-1] != t[T.length()-1]) flag = true;

			if(flag == false) {

				System.out.println(c);

			}else {

				System.out.println(-1);
			}


		}




	}

	public static int gcd(int a, int b) {

		if(b==0) return a;

		return gcd(b,a%b);
	}

}
