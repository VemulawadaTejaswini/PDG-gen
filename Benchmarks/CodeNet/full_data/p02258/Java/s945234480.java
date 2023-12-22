/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i = 0;i < n;i++){
			num.add(Integer.parseInt(scanner.nextLine()));
		}
		
		scanner.close();
		
		int max = Integer.MIN_VALUE;
		int num1,num2;
		int max_tmp = Integer.MIN_VALUE;
		
		for(int i = 0;i < n;i++){
			num1 = num.get(i);
			for(int j = i+1;j < n;j++){
				num2 = num.get(j);
				if(num2 - num1 > max_tmp){
					max_tmp = num2 - num1;
				}
			}
			if(max_tmp > max){
				max = max_tmp;
			}
		}
		System.out.println(max);
		
	}
}
