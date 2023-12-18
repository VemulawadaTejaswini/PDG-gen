import java.util.Arrays;

import java.util.Scanner;

public class Airplane {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		
		int getNUM[] = new int[3];
		
		
		for(int i = 0; i <= 2; i++){
            
			int inputNums = sc.nextInt();
	        getNUM[i] = inputNums;
		
		}
		
		Arrays.sort(getNUM);
		
		System.out.println(getNUM[0] + getNUM[1]);
	
	}
}
		