import java.util.*;
import java.io.*;
import java.lang.*;
public class test{
	static double res=0;
	public static void help(int p,int r,int n){
		double tmp=p;
		for(int i=1;i<=n;i++){
			double x=1+(double)r/1200 ;
			tmp*=x;
		}
		res+=tmp;
		int k=100000,m=360;
		for(int i=m;i>0;i--){
			help(k,5,i);
		}
		System.out.println("paid amount "+k*m+" ");
		System.out.println((long)res);
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
		
		System.out.println(Math.pow(n,3));
	}
}			
	











