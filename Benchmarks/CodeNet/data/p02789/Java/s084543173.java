public class Main {
	public static void main(String[] args) {
		Scanner twonum = new Scanner(System.in);
		int n = twonum.nextInt();
		int m = twonum.nextInt();
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