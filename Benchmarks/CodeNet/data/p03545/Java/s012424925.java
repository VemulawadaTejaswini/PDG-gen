

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		String val = String.valueOf(n);

		int n1 = Integer.parseInt(String.valueOf(val.charAt(0)));
		int n2 = Integer.parseInt(String.valueOf(val.charAt(1)));
		int n3 = Integer.parseInt(String.valueOf(val.charAt(2)));
		int n4 = Integer.parseInt(String.valueOf(val.charAt(3)));

		if (n1 + n2 + n3 + n4 == 7){
			System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "=7");
		}else if(n1 - n2 + n3 + n4 == 7){
			System.out.println(n1 + "-" + n2 + "+" + n3 + "+" + n4 + "=7");
		}else if(n1 + n2 - n3 + n4 == 7){
			System.out.println(n1 + "+" + n2 + "-" + n3 + "+" + n4 + "=7");
		}else if(n1 + n2 + n3 - n4 == 7){
			System.out.println(n1 + "+" + n2 + "+" + n3 + "-" + n4 + "=7");
		}else if(n1 + n2 - n3 - n4 == 7){
			System.out.println(n1 + "+" + n2 + "-" + n3 + "-" + n4 + "=7");
		}else if(n1 - n2 + n3 - n4 == 7){
			System.out.println(n1 + "-" + n2 + "+" + n3 + "-" + n4 + "=7");
		}else if(n1 - n2 - n3 + n4 == 7){
			System.out.println(n1 + "-" + n2 + "-" + n3 + "+" + n4 + "=7");
		}else if(n1 - n2 - n3 - n4 == 7){
			System.out.println(n1 + "-" + n2 + "-" + n3 + "-" + n4 + "=7");
		}

		sc.close();
	}

}