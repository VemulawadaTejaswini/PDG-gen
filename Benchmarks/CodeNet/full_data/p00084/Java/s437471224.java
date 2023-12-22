import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String sx = sc.readLine().replace(".","").replace(",","");
	    String[] st = sx.split(" ");
	    boolean flag = true;
	    for(String e:st){
		if(e.length()>2 && e.length()<7){
		    if(!flag)
			System.out.print(" ");
		    System.out.print(e);
		    flag = false;
		}
	    }
	    System.out.println();
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}