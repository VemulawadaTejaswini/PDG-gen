import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    while(true){
		String[] st = sc.readLine().split(" ");
		int r = Integer.valueOf(st[0]), c = Integer.valueOf(st[1]);
		if((r|c)==0)
		    break;
		if(r*c%2==0)
		    System.out.println("yes");
		else
		    System.out.println("no");
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}