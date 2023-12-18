

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int tot = in.nextInt();
		int cake = in.nextInt();
		int donut = in.nextInt();
		System.out.println((tot - cake) % donut);
	}

}
