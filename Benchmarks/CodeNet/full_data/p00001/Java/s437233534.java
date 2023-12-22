//problem a

import java.util.*;

public class Main{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in); //scanner
		int test;
		int num1 = 0, num2 = 0, num3 = 0;
		for (int x = 1; x<11; x++){
			System.out.println("Height of mountain " + x + ": ");
			test = scanner.nextInt();
			if (num1 > test){
				if (num2 > test){
					if (num3 > test){
						//do nothing
					}
					else{
						num3 = test;
					}
				}
				else{
					num3 = num2;
					num2 = test;
					
				}
			}
			else{
				num3 = num2;
				num2 = num1;
				num1 = test;
			}
		}
		System.out.println(num1 + "\n" + num2 + "\n" + num3);
	}
}