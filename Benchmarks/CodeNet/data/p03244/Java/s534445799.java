

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c[][] = new int[2][100005];
		for (int i=0;i<n;i++)
			c[i%2][sc.nextInt()]++;
		
		if (Maxid(c[0])!=Maxid(c[1]))
			System.out.println(Max(c[0])+Max(c[1]));
		else {
			int a = Max(c[0])+Max2(c[1]);
			int b = Max(c[1])+Max2(c[0]);
			
			if (a<b) System.out.println(a);
			else System.out.println(b);
		}
		
		
	}
	
	private static int Maxid(int[] a) {
		int max = 0;
		int id = 0;
		for (int i=0;i<a.length;i++) {
			if (max<a[i]) {
				max=a[i];
				id = i;
			}
		}
		
		return id;
	}

	private static int Max(int[] a) {
		int max = 0;
		int sum= 0;
		for (int i=0;i<a.length;i++) {
			if (max<a[i]) max=a[i];
			sum+=a[i];
		}
		
		return sum-max;
	}
	
	private static int Max2(int[] a) {
		int []cl = a.clone();
		Arrays.sort(cl);
		
		int max2 = cl[cl.length-2];
		int sum= 0;
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		return sum-max2;
	}
}
