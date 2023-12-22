import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	int n, s;
	int[] a;
	int ans;

	void rec(int k){
		int sum=0;
		for(int i=0; i<k; i++)
			sum+=a[i]*(i+1);
		if(k==n){
			if(sum==s){
//				println(Arrays.toString(a));
				ans++;
			}
			return;
		}
		if(sum>s)
			return;
		if((n-k)*n*9+sum<s)
			return;
		// n-kªcè
		// (n-k)*9+sumªsæè¬³¢Èç³
		for(int i=0; i<=9; i++){
			boolean f=false;
			for(int j=0; j<k; j++)
				if(a[j]==i)
					f=true;
			if(f)
				continue;
			a[k]=i;
			rec(k+1);
		}
	}

	void run(){
		sc=new Scanner(System.in);
		for(; sc.hasNext();){
			n=sc.nextInt();
			s=sc.nextInt();
			a=new int[n];
			ans=0;
			rec(0);
			println(ans+"");
		}
		sc.close();
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}