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
		int num[] = new int[n];
		
		for(int i = 0;i < n;i++){
			num[i] = Integer.parseInt(scanner.next());
		}
		
		int flag = 1;
		int tmp = 0;
		int cnt = 0;
		while(flag == 1){
			flag = 0;
			for(int j = n-1;j >= 1;j--){
				if(num[j] < num[j-1]){
					tmp = num[j];
					num[j] = num[j-1];
					num[j-1] = tmp;
					flag = 1;
					cnt++;
				}
			}
		}
		
		for(int i = 0;i < n;i++){
			if(i > 0){
				System.out.print(" ");
			}
			System.out.print(num[i]);
		}
		System.out.println();
		System.out.println(cnt);
	}
}
