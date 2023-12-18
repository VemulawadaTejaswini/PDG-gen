
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long h  = sc.nextLong();
		long ans = func(h);
		System.out.println(ans);

	}

	public static long func(long h) {
		if(h==1) {
			return 1;
		}
		else {
			return 2*func(h/2)+1;
		}
	}
}