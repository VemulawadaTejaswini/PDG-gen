

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int k = sc.nextInt();
		int time = (60*h2) + m2 - (60*h1) - m1;
		if (time > k) {
			System.out.println(time-k);
			return;
		} else {
			System.out.println(0);
		}


	}

}
