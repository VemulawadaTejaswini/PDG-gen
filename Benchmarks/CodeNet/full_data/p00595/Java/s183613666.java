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
        	int min_num = Math.min(Integer.parseInt(str1), Integer.parseInt(str2));
            for(int d = min_num; d>0; d--)
            {
                 if(Integer.parseInt(str1)%d==0 && Integer.parseInt(str2)%d==0)
                 {
                     System.out.println(d);
                     break;
                 }
        
            }
       
    }

}