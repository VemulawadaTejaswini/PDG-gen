

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		long k = sc.nextLong();

//		long times = 5000_0000_0000_0000L;
		for(int i = 0; i < k; i++){

			if(s.charAt(i) != '1'){
				System.out.println(s.charAt(i));
				return;
			}
		}

		System.out.println(1);
	}

}
