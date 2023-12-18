

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		input = input.replaceAll("BC", "D");
//		System.out.println(input);

		String array[] = input.split("[BC]");
		long result = 0;
		for(int i = 0; i < array.length; i++){
//			System.out.println(array[i]);

			int countA = 0;
//			int trans = 0;
			for(int j = 0; j < array[i].length(); j++){
				int c = array[i].charAt(j);

				if(c == 'A'){
					countA++;
				}
				else {
					result += countA;
				}
			}
		}
		System.out.println(result);
	}
}