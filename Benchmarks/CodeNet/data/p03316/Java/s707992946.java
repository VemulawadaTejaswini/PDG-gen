import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		String buf;
		buf=sc.nextLine();
		String[] sbuf=buf.split("");
		
		int sn=0;
		int n=Integer.parseInt(buf);
		
		for(int i=0; i<sbuf.length; i++){
			sn+=Integer.parseInt(sbuf[i]);
		}
		
		System.out.println( (n%sn==0)? "Yes" : "No" );

	}

	static void disp(long[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
