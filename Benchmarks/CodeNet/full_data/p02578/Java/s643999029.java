import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		int n = in.nextInt();
		int max = Integer.MIN_VALUE;
		int a[]=new int[n];
		int sum = 0;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			max = Math.max(max, a[i]);
			sum += (a[i] < max) ? (max - a[i]) : 0;
		}
		out.println(sum);
	}
}
