

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		// 1 : str[0]
		// 2 : order count Q
		// 3~ Last : order
		//
		// Order condition
		// 1) Print ab : a~b syso
		// 2) Reverse ab: a~b Reverse
		// 3) Replace ab : a~b P(str or char) Switch

		// Sample Input 1
		// abcde
		// 3
		// replace 1 3 xyz
		// reverse 0 2
		// print 1 4
		// Sample Output 1
		// xaze
		// Sample Input 2
		// xyz
		// 3
		// print 0 2
		// replace 0 2 abc
		// print 0 2
		// Sample Output 2
		// xyz
		// abc

		Scanner sc = new Scanner(System.in);

		// declear variable
		int min=0, max=0;
		String result = "";
		String tmpStr="";

		// str input
		String str = sc.nextLine();
		// ordercount input
		int orderCntQ = sc.nextInt();

		for (int i = 0; i < orderCntQ; i++) {
			String order = sc.next();
			min = Integer.parseInt(sc.next());
			max = Integer.parseInt(sc.next());
			if (order.equals("replace")) {
				tmpStr = sc.next();
				 Order1(str, result, order, min, max, tmpStr);
			} else {
				 Order2(str, result, order, min, max);
			}
			System.out.println(result);
		}

	}

	static void Order1(String result, String order, String str, int min, int max, String tmpStr) {
		//replace()
		str = str.replace(str.substring(min,max), tmpStr);
		result = str;
		System.out.println(result);
	}

	static void Order2(String str, String order, String result, int min, int max) {
		switch (order) {
		case "reverse":
				//substring()
			str += str.substring(max,min);
			result = str;
			System.out.println(result);
			break;
		case "print":
				//charAt()
			for(int i = min; i <max;i++){
			result += str.charAt(i);
			}System.out.println(result);
			break;
		}

	}
}