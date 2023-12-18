import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		String buf;
		buf=sc.nextLine();
		String[] sbuf=buf.split("");
		
		int a=0;
		for(int i=0; i<sbuf.length; i++){
			if(sbuf[i].equals("+")){
				a+=1;
			}else{
				a-=1;
			}
		}
		
		System.out.println(a);

	}

	static void disp(long[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
