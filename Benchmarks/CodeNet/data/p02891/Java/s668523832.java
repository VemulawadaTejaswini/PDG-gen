

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();
		int k = sc.nextInt();;

		int changeCount = 0;
		for(int i = 1; i < str.length; i++){
			if(str[i] == str[i - 1]){
				changeCount++;
				str[i] = 'A';
			}
		}
//		System.out.println(changeCount);
		long result = (long)k*changeCount;

		System.out.println(result);
	}

}
