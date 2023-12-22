import java.util.*;
import java.io.*;
public class Main {
	static int A[];
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt();A=new int[n];
		for(int i=0;i<n;i++)A[i]=Integer.parseInt(cin.next());
		
		int q=cin.nextInt();
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<q;i++) {
			if(solve(0,1,Integer.parseInt(cin.next())))out.println("yes");
			else out.println("no");
		}
		out.flush();
	}
	
	static boolean solve(int a,int b,int m) {
		boolean x=false,y=false;
		//System.out.println(a+" "+b);
		if(A[a]+A[b]==m)return true;
		else {
			if(a+1<b)x=solve(a+1,b,m);
			if(b+1<A.length)y=solve(a,b+1,m);
		}
		
		if(x || y)return true;
		return false;
	}

}

