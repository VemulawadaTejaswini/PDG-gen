import java.util.*;

public class Main {
	static final int r = 1000000000 + 7;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		String an[] = {"Yes", "No"};
		int numa = (c + b - 1) / b;
		int numb = (a + d - 1) / d;
		int ans = 1;
		if(numa <= numb)ans = 0;
		sc.close();
		System.out.println(an[ans]);
	}
}
