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

 
   public static long getGreatest(int a,int b) {
        
        int min_num = Math.min(a, b);
        for(int d = min_num; d>0; d--)
        {
             if(a%d==0 && b%d==0)
             {
            	 return d;
             }
   
        }
       return 0; 
        
       }
}