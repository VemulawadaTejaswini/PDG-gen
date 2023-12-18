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
	//static int count = 0;

	public static void main(String[] args) {
		int h=scn.nextInt();
		int a=scn.nextInt(),sum=0;
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=scn.nextInt();
			sum+=arr[i];
		}
		if(sum>=h)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}
