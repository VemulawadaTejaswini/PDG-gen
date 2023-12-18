//package at_coder;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String str = sc.next();
		int length = str.length();
		char[] num = {'0','1'};
		int count = 0;
		for(int i=0;i<length;i++)
			if(str.charAt(i)==num[i%2])
				count++;
		System.out.println(count <= length/2 ? count : length-count);
	}
}