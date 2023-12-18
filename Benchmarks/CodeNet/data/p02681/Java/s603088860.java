//package ZS12_2C;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next() , str2 = sc.next();
		for(int i = 0 ; i < str1.length() ; i++)
			if(str1.charAt(i)!=str2.charAt(i)) {
				System.out.println("NO");
				return ;
			}
		System.out.println("YES");

	}

}
