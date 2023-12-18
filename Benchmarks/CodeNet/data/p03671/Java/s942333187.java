
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ab = a + b;
		int ac = a + c;
		int bc = b * c;
		int ans = ab;
		if (ans > ac)
			ans = ac;
		else if (ans > bc)
			ans = bc;
		System.out.println(ans);
		sc.close();
	}
}