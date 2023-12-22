/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String ans = "";
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		if(n<=26) {
			ans = Character.toString(alphabet[(int)n-1]) + ans; 
		}
		else {
			while(n>26) {
				long a = n%26;
				int b = (int) a;
				n=n/26;
				if(b!=0) {
					ans = Character.toString(alphabet[b-1]) + ans;
				}
				else {
					ans = Character.toString(alphabet[25]) + ans;					
					n--;
				}
				
			}
			if(n<=26) {
				ans = Character.toString(alphabet[(int)n-1]) + ans; 
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
