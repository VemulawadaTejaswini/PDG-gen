/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	static int[] a1, a2;
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//回数
		int k = sc.nextInt();	//k番目
		
		a1 = new int[n];
		a2 = new int[n];
		
		for(int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
			a2[i] = sc.nextInt();
		}
		quickSort(0, a1.length-1);
		
		int count = 0;
		while(k > 0) {
			k -= a2[count];
			count++;
		}
		System.out.println(count);
	}
	
	public static void quickSort(int i, int j) {
		if(i == j ) { return; }
		int p = pivot(i, j);
		if(p != -1) {
			int k = partition(i , j , a1[p]);
			quickSort(i, k-1);
			quickSort(k, j);
		}
	}
	
	public static int pivot(int i, int j) {
		int k = i + 1;
		while(k <= j && a1[i] == a1[k]) {
			k++;
		}
		if(k > j) { return -1;}
		if(a1[i] >= a1[k]) { return i;}
		return k;
	}
	
	public static int partition(int i, int j, int x) {
		int l = i;
		int r = j;
		
		while(l <= r) {
			
			while(l <= j && a1[l] < x) {
				l++;
			}
			
			while( r >= i && a1[r] >= x) {
				r--;
			}
			
			if(l > r) { break;}
			int t = a1[l];
			a1[l] = a1[r];
			a1[r] = t;
			t = a2[l];
			a2[l] = a2[r];
			a2[r] = t;
			l++;
			r--;
		}
		return l;
	}
	
}
