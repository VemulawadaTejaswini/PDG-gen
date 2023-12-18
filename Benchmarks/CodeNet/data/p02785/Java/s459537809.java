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
		int n=scn.nextInt();
		int k=scn.nextInt(),count=0;
		long sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
			//sum+=arr[i];
		}
		Arrays.parallelSort(arr);
		for(int i=0;i<n-k;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
		
	}
}
