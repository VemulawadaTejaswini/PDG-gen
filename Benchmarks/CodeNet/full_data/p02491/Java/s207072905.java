import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt();
		System.out.printf("%d %d %.5f\n", a/b, a%b, (double)a/b);
	}
}