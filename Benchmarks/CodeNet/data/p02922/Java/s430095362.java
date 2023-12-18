import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		int n = 0;
		while( n*(a-1) +1 < b  ) {
			n++;
		}

		System.out.println(n);
		in.close();
	}
}