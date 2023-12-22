import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n;
		StringBuilder sb = new StringBuilder();
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();

		for (int i = 0; i < n; i++) {
			sb.append(stdIn.next() + " ");
		}
		sb.delete((sb.length()-1), sb.length());
		System.out.println(sb.reverse());
	}

}