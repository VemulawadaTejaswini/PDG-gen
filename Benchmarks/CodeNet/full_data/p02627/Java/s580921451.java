/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
        Scanner input=new Scanner(System.in);
        String ch;
        ch=input.next();
        // char[] array=ch.toCharArray();
        // System.out.println("ch="  + ch.charAt(0));
        
        boolean ans=Character.isUpperCase(ch.charAt(0));
        if(ans)
            System.out.println("A");
        else  
             System.out.println("a");
        input.close();
	}
}