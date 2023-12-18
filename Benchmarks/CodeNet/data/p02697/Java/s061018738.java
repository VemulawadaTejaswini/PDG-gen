

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < m/2; i++){
			System.out.println((i + 1) + " " + (m - i));
		}

		for(int i = 0; i < m - m/2 ; i++){
			System.out.println((m + i + 1) + " "+ (2*m + 1 - i));
		}

	}

}
