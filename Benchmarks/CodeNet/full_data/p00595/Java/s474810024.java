import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       
        	Scanner scan = new Scanner(System.in);
        	String str1 = scan.next();
        	String str2 = scan.next();
        	if(Integer.parseInt(str1)>10000 || Integer.parseInt(str2)>10000)
        	{
        		System.out.println("??°??????100000????????§??\?????????????????????");
        	}
        	System.out.println(getGreatest(Integer.parseInt(str1),Integer.parseInt(str2)));
       
    }

 
   public static int getGreatest(int a,int b) {
       
	   int r;
       
	   if(a<b)
       {
    	   int temp = a;
    	   a = b;
    	   b = temp;
       }
       
       while(b>0)
       {
    	   r = a % b;
    	   a = b;
    	   b = r;
    	   return r;
       }
       return 0;
       }