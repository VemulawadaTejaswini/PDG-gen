

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "NO";
		int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int count1 = 0;
		int count2 = 0;
		for(int i : a) {
			if(i == 5) {
				count1++;
			} else if (i == 7) {
				count2++;
			} 
		}
		if (count1 == 2 && count2 == 1)	result = "YES";
		System.out.println(result);
		}
		
	}


