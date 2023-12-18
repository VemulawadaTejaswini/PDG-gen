import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {

         Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		String t=sc.next();
	//	System.out.println(t.substring(0,t.length()));
		if(s.equals(t.substring(0,t.length()-1)))System.out.println("Yes");
		else
System.out.println("No");




         
       // System.out.println("Hello World!");
    }
}