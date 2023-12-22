/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.ArrayList;
import java.util.List;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//文字列読込み
		Scanner sc = new Scanner(System.in);

		//結果格納
		int scInt;	//1行
		int[] check  = new int[100];
		int max = 0;

		while (sc.hasNext()) {
			//1行読込み
			scInt = sc.nextInt();
			check[scInt] = check[scInt] + 1;	
			if (max < check[scInt]) {
				max = check[scInt];
			}
		}
		
		for (int i = 0; i < 100; i++) {
			if (check[i] == max) {
				System.out.println(i);
			}
		}
		
	}
}
