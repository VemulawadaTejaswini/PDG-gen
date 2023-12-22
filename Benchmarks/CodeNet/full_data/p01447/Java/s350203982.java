public class Main {

	private static int ld() {
		try (final java.util.Scanner sc = new java.util.Scanner(System.in)) {
			return sc.nextInt();
		}
	}
	
	public static void main(String[] args) {
		int n = ld();
		int rvalue;
		for (rvalue = 1; ; ++rvalue) {
			if (n <= 3) break ;
			n = (n / 3) + (n % 3 == 0 ? 0 : 1);
		}
		System.out.println(rvalue);
	}

}

