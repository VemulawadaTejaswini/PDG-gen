

import java.util.*;
import java.io.PrintWriter;
class B{
	
	static PrintWriter out;
	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		out=new PrintWriter(System.out);
		
		int n=sc.nextInt();
		long x=sc.nextLong();
		int ans=0;
		for(int i=0;i<n;i++) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			if(a*a+b*b<=x*x)
				ans++;
		}
		out.println(ans);
		
		sc.close();
		out.close();
		
	}
}
