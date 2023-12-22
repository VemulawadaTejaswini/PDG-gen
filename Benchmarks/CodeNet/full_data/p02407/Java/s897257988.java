import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// don't use Array ...
		Scanner in = new Scanner(System.in);
		in.nextLine();
		StringBuilder sb = new StringBuilder(in.nextLine());
		System.out.println(sb.reverse());
		
	}
}