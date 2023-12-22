import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {

         Scanner sc=new Scanner(System.in);
		 long a=sc.nextLong();
		 long b=sc.nextLong();
		 long c=sc.nextLong();
		 long k=sc.nextLong();
		//String t=sc.next();
long	mx=0;
		if(k>a){
		    mx=mx+a;
		    k=k-a;
		    if(k>b){
		        k=k-b;
		    }else k=0;
		    
		    if(k>0){
		        mx-=k;k=0;
		    }
		    
		}else mx=k;
		
		
		
		
		System.out.println(mx);
	




         
       // System.out.println("Hello World!");
    }
}