public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		String S = judge(N % 26);
		N /= 26;

		while (N != 0) {
			S = judge(N % 26) + S;
			N /= 26;
		}

		System.out.println(S);
	}

	public static String judge(long x) {
		String str = null;

		if (x == 1) {
			str = "a";
		} else if (x == 2) {
			str = "b";
		} else if (x == 3) {
			str = "c";
		} else if (x == 4) {
			str = "d";
		} else if (x == 5) {
			str = "e";
		} else if (x == 6) {
			str = "f";
		} else if (x == 7) {
			str = "g";
		} else if (x == 8) {
			str = "h";
		} else if (x == 9) {
			str = "i";
		} else if (x == 10) {
			str = "j";
		} else if (x == 11) {
			str = "k";
		} else if (x == 12) {
			str = "l";
		} else if (x == 13) {
			str = "m";
		} else if (x == 14) {
			str = "n";
		} else if (x == 15) {
			str = "o";
		} else if (x == 16) {
			str = "p";
		} else if (x == 17) {
			str = "q";
		} else if (x == 18) {
			str = "r";
		} else if (x == 19) {
			str = "s";
		} else if (x == 20) {
			str = "t";
		} else if (x == 21) {
			str = "u";
		} else if (x == 22) {
			str = "v";
		} else if (x == 23) {
			str = "w";
		} else if (x == 24) {
			str = "x";
		} else if (x == 25) {
			str = "y";
		} else if (x == 0) {
			str = "z";
		}

		return str;
	}

}