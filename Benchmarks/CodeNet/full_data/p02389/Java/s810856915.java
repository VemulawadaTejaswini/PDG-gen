import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int x = n.nextInt();
		Scanner m = new Scanner(System.in);
		int y = m.nextInt();
		System.out.print(x*y + " " + (x+y)*2);
	}
}