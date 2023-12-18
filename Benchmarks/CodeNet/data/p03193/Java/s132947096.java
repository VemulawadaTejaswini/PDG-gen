
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
 {
	public static void main (String[] args)
	 {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(),h=sc.nextInt(),w=sc.nextInt();
            long count=0;
            while(n-->0) {
            	int n1=sc.nextInt(),n2=sc.nextInt();
            	if(n1<h || n2<w)
            		count+=0;
            	else
            		count++;
            }
            System.out.println(count);
	 }
}