import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int ans = (int)Math.floor(a + Math.pow(a, 2) + Math.pow(a, 3));

		System.out.println(ans);
	}

}
