public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var N = sc.nextInt();

		long count = 0;
		for (int A = 1; A <= N-1; A++) {
				count+=(N-1)/A;
		}
		System.out.println(count);
	}
}
