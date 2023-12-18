
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
 {
	public static void main (String[] args)
	 {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(),k=sc.nextInt(),a[]=new int[n],i;
            int min=(int)Math.pow(10,9)+7;
            for(i=0;i<n;i++) {
            	a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            for(i=0;(i+k-1)<n;i++) {
            	int diff=a[i+k-1]-a[i];
            	if(diff<min)
            		min=diff;
            }
            System.out.println(min);
	 }
}