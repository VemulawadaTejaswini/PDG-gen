

import java.util.*;

public class Main {
	
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		long n= sc.nextLong();
	
		
		int k=1;
		
		for(int i=1;i<10;i++){
			if(n>Math.pow(10,i))k++;
			//System.out.println(k + " "+(10^3) );
			//else break;
		}
		
		int ans =count(n);
		
		
		
		System.out.println(ans);
	}
	
	
	
	public static double fac(double n, double k){
		double ans =0;
		if(n>7*Math.pow(10,k-1))ans=Math.pow(3,k)-3*Math.pow(2,k);
		else if(n>5*Math.pow(10,k-1))ans=2*Math.pow(3,k-1)-Math.pow(2,k);
		else if(n>3*Math.pow(10,k-1))ans=Math.pow(3,k-1)-2*Math.pow(2,k-1);
		else ans=fac(8*Math.pow(10,k-2),k-1);
		return ans;
	}
	
	public static int count(long n){
		int c=0;
		for(long i=n;n>356;i--){
			if(i%2==0)continue;
			String s = String.valueOf(i);
			int num3 = s.indexOf('3')+1;
			int num5 = s.indexOf('5')+1;
			int num7 = s.indexOf('7')+1;
			if(num3*num5*num7==0)continue;
			if(s.indexOf('0')!=-1 || s.indexOf('1')!=-1 ||s.indexOf('2')!=-1 ||s.indexOf('4')!=-1 ||s.indexOf('6')!=-1 ||s.indexOf('8')!=-1 ||s.indexOf('9')!=-1)continue;
			
			c++;
			}
		return c;
		}

}

