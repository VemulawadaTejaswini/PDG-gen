import java.util.Scanner;

class Main {
	static int mod = 1000000007;
	private static long[] fact;
	private static long[] inv_fact;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();


		char[] c = s.toCharArray();

		int count = 0;
		for (int i = 0; i < c.length; i++) {

			char l = c[i];
			char r = c[c.length - i - 1];


			if(l != r) {
				count++;
			}

		}

		System.out.println(count / 2);



	}

}