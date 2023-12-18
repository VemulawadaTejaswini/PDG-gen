/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static int result1 = Integer.MAX_VALUE;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		int[] input = new int[n];
		int[] result = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(sc.next());
		}
		
		counting(input, result, 0, 0, true);
		counting(input, result, 0, 0, false);
		System.out.println(result1);
	}
	
	public static void counting(int[] input, int[] result, int count, int index, boolean sign) {
		if(index > 0) {
			result[index] = result[index-1] + input[index];
		} else {
			result[index] = input[index];
		}
		
		if(sign) {
			if(result[index] <= 0) {
				count += Math.abs(result[index]) + 1;
				result[index] = result[index] + Math.abs(result[index]) + 1;
			} 
			sign = false;
		} else {
			if(result[index] >= 0) {
				count += Math.abs(result[index]) + 1;
				result[index] = result[index] - Math.abs(result[index]) - 1;
			}
			sign = true;
		}
		System.out.println(Arrays.toString(result) + count);
		
		if(index < result.length-1) {
			counting(input, result, count, index+1, sign);
		} else {
			if(result1 > count) {
				result1 = count;
			}
			
		}
	}
}