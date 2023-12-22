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
		//取得
		String scline  = sc.nextLine();	//1行取得
		int len = scline.length();

		String scChar;
		String result = "";

		for (int i = 0; i < len; i++) {
			scChar = String.valueOf(scline.charAt(i));
			if(Character.isUpperCase(scline.charAt(i))) {
				//大文字
				result = result + scChar.toLowerCase();
			} else {
				//小文字
				result = result + scChar.toUpperCase();
			}
		}
		System.out.println(result);
	}
}
