

import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
		double num = 0;
		num = in.nextDouble();
		double round =Math.pow(10,200000);
		if (num >=0 && num < round){
		    if (num % 2 == 0){
    		    System.out.println("no");
    		}else{
    		    
    		    if(num%9 == 0){
    		        System.out.println("yes");
    		    }else{
    		        System.out.println("no");
    		    } 
		    }
		}else{
            System.out.println("no");
        }
		
	}
}
