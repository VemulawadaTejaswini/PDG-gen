import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int X = Integer.parseInt(scan.next());
		int T = Integer.parseInt(scan.next());
		int ans = 0;

		while (N > 0) {
			ans+=T;
			N-=X;
		}
		System.out.println(ans);
	}

}
