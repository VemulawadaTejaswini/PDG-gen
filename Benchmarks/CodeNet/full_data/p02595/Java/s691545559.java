import java.util.*;
import java.lang.*;
import java.io.*;
 public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        double d=sc.nextDouble();
        int a[]=new int[n];
        int b[]=new int[n];	

     for(int i=0;i<n;i++){
     	a[i]=sc.nextInt();
     	b[i]=sc.nextInt();
           }

       int count=0;
           for(int i=0;i<n;i++){
           	if(func(a[i],b[i])<=d)
           		count++;
           }
           System.out.println(count);
     }
	

	public static double func(int a,int b){
		double a1=Math.pow(a,2);
		double b1=Math.pow(b,2);
		double c=Math.sqrt(a1+b1);
		return c;
	}
}





