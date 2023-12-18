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
		long x = sc.nextLong();
		long y = sc.nextLong();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		ArrayList<Integer> p = new ArrayList<Integer>();
		ArrayList<Integer> q = new ArrayList<Integer>();
		ArrayList<Integer> r = new ArrayList<Integer>();
		for(int i=0;i<a;i++) {
			p.add(sc.nextInt());
		}
		for(int i=0;i<b;i++) {
			q.add(sc.nextInt());
		}
		for(int i=0;i<c;i++) {
			r.add(sc.nextInt());
		}
		Collections.sort(p,Collections.reverseOrder());
		Collections.sort(q,Collections.reverseOrder());
		Collections.sort(r,Collections.reverseOrder());
		int i=0, j=0, k=0;
		long res = 0;
		while(x!=0 || y!=0) {
			if(x!=0) {
				if(i!=a && k!=c && p.get(i)>=r.get(k)) {
					res+=p.get(i);
					i++;
				}
				else if(i!=a && k==c) {
					res+=p.get(i);
					i++;
				}
				else if(i==a && k!=c) {
					res+=r.get(k);
					k++;
				}
				else {
					res+=r.get(k);
					k++;
				}
				x--;
			}
			if(y!=0) {
				if(j!=b && k!=c && q.get(j)>=r.get(k)) {
					res+=q.get(j);
					j++;
				}
				else if(j!=b && k==c) {
					res+=q.get(j);
					j++;
				}
				else if(j==b && k!=c) {
					res+=r.get(k);
					k++;
				}
				else {
					res+=r.get(k);
					k++;
				}
				y--;
			}
		}
		System.out.println(res);
		sc.close();

	}
}
