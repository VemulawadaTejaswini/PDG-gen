import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());

		int ans = (int) ((t + 0.5) / a) * b;
		System.out.println(ans);
	}

}
