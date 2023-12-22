import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
		int num = 0;
		num = in.nextInt();
		if (num >=0 && num < Math.pow(10,20000)){
		    if(num%9 == 0){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    } 
		}else{
		    System.out.println("no");
		}
	}
}