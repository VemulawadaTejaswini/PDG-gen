

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

//import dp.Main.PrimsPair;

public class Main {

	public static int lowerBound(long[] array, int length, long value) {
		int low = 0;
		int high = length;
		while (low < high) {
			final int mid = (low + high) / 2;
			if (value <= array[mid]) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	// method to return LCM of two numbers
	static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}

	public static void sortbyColumn(int arr[][], int col) {
		// Using built-in sort function Arrays.sort
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			// Compare values according to columns
			public int compare(final int[] entry1, final int[] entry2) {

				// To sort in descending order revert
				// the '>' Operator
				// if (entry1[col] > entry2[col])
				// return 1;
				// else //(entry1[col] >= entry2[col])
				// return -1;
				return new Integer(entry1[col]).compareTo(entry2[col]);
				// return entry1[col].
			}
		}); // End of function call sort().
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		FastReader sc = new FastReader();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scn = new Scanner(System.in);
		// PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n=sc.nextInt();
		int l=sc.nextInt();
		int arr[]=new int[n];
		int c=0;
		double sum=0;
		double lo=0;
		for(int i=l;c<n;i++){
			arr[c]=Math.abs(i);
			lo+=i;
			sum+=arr[c];
		//	System.out.println(arr[c]+" ");
			c++;
			}
		Arrays.sort(arr);
		double avg=(sum*1.0)/n;
	//	System.out.println(sum);
		
		int k=0;
		{
		if(Math.abs(arr[0]-avg)<Math.abs(arr[arr.length-1]-avg))
		{
		k=arr[arr.length-1];
	sum-=k;
			//	k=arr.length-1;
		}
		else{
			k=arr[0];
			sum-=k;
		//k=0;	
		}}
		sum=0;
		c=0;
		for(int i=l;c<n;i++){
			//if(c!=k)
			sum+=i;
			c++;
		}
		if(lo<0)
			sum+=k;
		else
			sum-=k;
	//	sum+=21;
	//	System.out.println(arr[0]+" "+avg+" "+arr[arr.length-1]+" "+k);
		System.out.println(Math.round(sum));
	}
}
