

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		while(a < -1000);

		int b = scanner.nextInt();
		while(b > 1000);

		if(a > b) {
			System.out.println("a > b");
		}else if(a < b){
			System.out.println("a < b");
		} else {
			System.out.println("a == b");
		}
	}
}

