/*package whatever //do not write package name here */

import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		
		if(n<x) {
		    System.out.println(t);
		}
		
		int ans = t;
		
		while(n != 0 && n>x) {
		    n = n-x;
		    ans += t;
		}
		System.out.println(ans);
		
	}
	

}