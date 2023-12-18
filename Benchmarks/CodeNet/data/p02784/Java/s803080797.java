
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		int n = sc.nextInt();
		long at = 0;
		for(int i = 0; i < n; i++) {
			at += sc.nextLong();
		}
		System.out.println(at >= h ? "Yes" : "No");
	}

}
