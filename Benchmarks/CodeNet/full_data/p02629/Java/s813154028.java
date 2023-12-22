

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		String name = "";
		while(n > 0){
			name = (char)(n%26 + 'a' - 1) + name;

			n /= 26;
		}

		System.out.println(name);
	}
}