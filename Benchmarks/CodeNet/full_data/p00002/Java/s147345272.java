package Digit_Number;

import java.util.*;
class Main03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int sum;
		int cnt = 1;
		int value;
		while(cnt <= 200 || scan.hasNext()){
			a = scan.nextInt();
			b = scan.nextInt();
			sum = a + b;
			value = 0;
			while(sum > 0){
				sum = sum /10;
				value++; 
			}
			System.out.println(value);
			cnt++;
		}	

	}

}