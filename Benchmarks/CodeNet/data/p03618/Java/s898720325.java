import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner cin = new Scanner(System.in);
		String s = cin.nextLine();
		long cnt[] = new long[26];
		long pairs = 1;
		for(int j = 0;j<26;j++) {
			cnt[j] = 0;
		}
		for(int j = 0;j<s.length();j++) {
			cnt[s.charAt(j)-97]++;
		}
		for(int j = 1;j<26;j++) {
			for(int x = 0;x<j;x++) {
				pairs += cnt[j]*cnt[x];
			}
		}
		System.out.println(pairs);
	}
}