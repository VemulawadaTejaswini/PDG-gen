import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), t = sc.nextInt();
		System.out.println(((int)((t+0.5)/a)*b));
	}
}
