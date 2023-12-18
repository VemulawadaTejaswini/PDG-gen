import java.util.*;
public class Main {
	Scanner sc;
	int A,B;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		A = sc.nextInt();
		B = sc.nextInt();
		int open = 1;
		int c = 0;
		while (open < B) {
			c++;
			open = open + A - 1;
		}
		System.out.println(c);
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}