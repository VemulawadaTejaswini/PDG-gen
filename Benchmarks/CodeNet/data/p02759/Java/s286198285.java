package atCoder;

import java.util.Scanner;

class DuplexPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%2 == 0) {
			System.out.println(n/2);
		}else {
			System.out.println(n/2 +1);
		}

	}

}
