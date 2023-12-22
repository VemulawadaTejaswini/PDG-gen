import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = scan.nextInt();
		for ( int i = 1; i <= n; i++ ) {
			sb.append( (i % 3 == 0)||(i % 10 == 3) ? " " + i : "" );
		}
		System.out.print(sb);
	}
}