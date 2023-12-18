import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		String buf=sc.nextLine();
		
		String[] sbuf=buf.split(" ");
		int n=Integer.parseInt(sbuf[0]);
		int k=Integer.parseInt(sbuf[1]);
		sbuf=sc.nextLine().split(" ");
		
		int[] num=new int[sbuf.length];
		for(int i=0; i<sbuf.length; i++){
			num[i]=Integer.parseInt(sbuf[i]);
		}
		
		int a=1;
		int sub=k-1;
		n-=k;
		
		
		while(n>=sub){
			n-=sub;
			
			a+=1;
		}
		
		System.out.println( (n>0)? a+1: a);
	}

	static void disp(long[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
