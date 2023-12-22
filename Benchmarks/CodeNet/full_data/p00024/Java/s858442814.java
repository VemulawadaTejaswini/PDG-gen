import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	try{
	    String t;
	    while((t = sc.readLine()) != null){
		double v = Double.valueOf(t);
		double p = 1.0 + 1.0/5.0*4.9*(v/9.8)*(v/9.8);
		double x = (double)((int)p);
		if(v==0.0){
		    System.out.println(2);
		    continue;
		}		
		if(p==x)
		    System.out.println((int)x);
		else
		    System.out.println((int)x+1);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}