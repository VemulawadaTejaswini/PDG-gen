import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float a = in.nextFloat(), b = in.nextFloat();
		System.out.printf("%1.0f %1.0f %1.5f\n", a/b, a%b, a%b);
	}
}