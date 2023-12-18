/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static void quick_sort(int[] d, int[] e, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2];
        int l = left, r = right, tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                tmp = e[l]; e[l] = e[r]; e[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }
    
    public static void result_print(int[] d, int[] e, int k) {
    	int count = 0;
    	while(k > 0) {
    		k = k - e[count];
    		count++;
    	}
    	System.out.print(d[count]);
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] d = new int[n];
		int[] e = new int[n];
		
		for(int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
			e[i] = sc.nextInt();
		}
		quick_sort(d, e, 0, d.length - 1);
	}
}