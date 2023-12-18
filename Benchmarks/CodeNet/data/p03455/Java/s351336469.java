import java.io.*;
import java.util.*;

public class Main {
	  public static void main (String args[]) throws Exception
	  {
	    Scanner cin = new Scanner(System.in);
	    int a = cin.nextInt(), b = cin.nextInt();
	    int c = a*b;
	    if(c%2==0){
	    	System.out.println("Even");
	    }else{
	    	System.out.println("Odd");
	    }
	  }	
}