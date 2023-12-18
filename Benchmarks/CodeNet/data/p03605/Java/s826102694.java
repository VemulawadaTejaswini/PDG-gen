public class abc073a {
	public static void main(String[] args) {
		int N = Integer.valueOf(args[0]);
		if ((N / 10)  == 9 || (N % 10) == 9) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
