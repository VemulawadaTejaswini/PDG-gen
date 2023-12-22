
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
			int w=Integer.parseInt(cin.next());
			if(solve(0,w))out.println("yes");
			else out.println("no");
		}
		out.flush();
	}
	
	static boolean solve(int i,int m) {
		
		if(i==A.length)return false;
		if(m==0)return true;
		
		if(solve(i+1,m-A[i]) || solve(i+1,m))return true;
		return false;
	}

}

