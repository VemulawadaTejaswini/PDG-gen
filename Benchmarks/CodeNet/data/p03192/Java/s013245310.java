package atcoder_problem;

import java.util.Scanner;

public class Main {

	public static int getTwoNumbers(int number) {
		
		if(number<1000 || number>9999) {
			throw new RuntimeException("the input is wrong");
		}
		int index = 0;
		
		String value = String.valueOf(number);
		
		char[] chars = value.toCharArray();
		
		for(int i=0; i<chars.length; i++) {
			if(chars[i]=='2') {
				index++;
			}else {
				continue;
			}
		}
		
		return index;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String value = sc.next();
		
		int number = Integer.valueOf(value);
		
		int twoNumbers = getTwoNumbers(number);
		
		System.out.println(twoNumbers);
	}
}
