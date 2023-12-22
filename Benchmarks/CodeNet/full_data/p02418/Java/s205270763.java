

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String str1 = in.next();
		String str2 = in.next();

		String ring_str = str1 + str1;

		//System.out.println(ring_str);

		int result = ring_str.indexOf(str2);

		if(result == -1){

			System.out.println("No");

		}else{

			System.out.println("Yes");

		}
	}
}