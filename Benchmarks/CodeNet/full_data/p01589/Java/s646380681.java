import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.util.Collections.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// Strange Currency System
// 2012/12/15
public class Main{
	Scanner sc=new Scanner(System.in);

	int n;
	int[] a;

	void run(){
		n=sc.nextInt();
		a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		sort(a);
		long sum=0;
		for(int i=0; i<=n; i++){
			if(i==n||a[i]>sum+1){
				println(sum+1+"");
				break;
			}
			sum+=a[i];
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}