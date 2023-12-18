
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	static int mod = (int) 1e9 + 7;

	static long sumIncreasing(int[] a, int[] w) {
		long maxSum = Integer.MIN_VALUE;
		TreeMap<Integer, Long> sums = new TreeMap<>();
		for (int i = 0; i < a.length; i++) {
			Entry<Integer, Long> lowerSum = sums.lowerEntry(a[i]);
			long sum = (lowerSum != null ? lowerSum.getValue() + w[i] : w[i]);
			sums.put(a[i], sum);
			for (Entry<Integer, Long> e; (e = sums.higherEntry(a[i])) != null && e.getValue() <= sum;)
				sums.remove(e.getKey());
			if (sum > maxSum)
				maxSum = sum;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		int wt[]=new int[n];
		for(int i=0;i<n;i++){
			wt[i]=scn.nextInt();
		}
		
		System.out.println(sumIncreasing(a, wt));

	}

}