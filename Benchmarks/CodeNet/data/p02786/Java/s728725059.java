//package codeforces;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.Set;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static int mod = 1000000007;
	static long count = 0;

	public static void main(String[] args) {
		long h=scn.nextLong();
		if(h==1)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println(hel(h));
		}
		
	}
	public static long hel(long d)
	{	if(d<1)
		return 0;
		if(d==1)
			return 1;
		else
		{
			return 1+2*hel(Math.floorDiv(d, 2));
		}
	}
}
