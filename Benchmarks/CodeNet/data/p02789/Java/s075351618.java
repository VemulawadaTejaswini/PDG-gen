public class Main {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[0]);
		if (m == n) {
			if (n >= 1 || n <=100) {
				System.out.println("yes");
			}
		}
		else {
			System.out.println("no");
		}
	}

}