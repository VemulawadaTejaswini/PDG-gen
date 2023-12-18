import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		sc.close();
		for (int i = 1; i <= b; i++) {
			if ((i * a) % b == c) {
				System.out.println("YES");
				return;
			}
			i++;
		}
		System.out.println("NO");
	}
}