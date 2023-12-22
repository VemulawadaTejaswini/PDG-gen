import java.util.*;
class Main {
	public static void main(String[] array) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("a %s b\n", a == b ? "==" : a > b ? ">" : "<");
	}
}