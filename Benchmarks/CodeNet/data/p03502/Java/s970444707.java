import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str_n = scan.next();
		int n = Integer.parseInt(str_n);
		int n_length = str_n.length();
		int i = 0;
		int fx = 0;
		String message = "No";
		for(i = 0; i < n_length; i++) {
			int m = Integer.parseInt(str_n.charAt(i) + "");
			fx = fx + m;
		}
		if(n % fx == 0) {
			message = "Yes";
		}
		System.out.println(message);
	}
}