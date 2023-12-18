/*package whatever //do not write package name here */

import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int s = 0,j;
		for(int i = 0;i < n;i++)
		{
		    a[i] = sc.nextInt();
		    s += a[i];
		}
		s /= n;
		float m = Math.abs(a[0] - s);
		j = 0;
		for(int i = 1;i < n;i++)
		{
		    float m1 = Math.abs(a[i] - s);
		    if(m1 < m)
		    {
		    m = m1;
		    j = i;
		    }
		}
		System.out.print(j);
	}
}