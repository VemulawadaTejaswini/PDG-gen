public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println((Main.calc(scanner.nextInt()))?"Yes":"No");
	}

	
	public static boolean calc(int n) {
		for (int i4 = 0; i4*4 <= n; i4++) {
				if((n-i4*4)%7 == 0) {
					return true;
				}
		}
		return false;
	}
}