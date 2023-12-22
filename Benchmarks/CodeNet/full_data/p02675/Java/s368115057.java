import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String ans = "";
		n = n % 10;
		if (n == 2 || n == 4 || n == 5 || n == 7 || n == 9)
			ans = "hon";
		if (n == 0 || n == 1 || n == 6 || n == 8)
			ans = "pon";
		if (n == 3)
			ans = "bon";

		System.out.println(ans);
	}
}

