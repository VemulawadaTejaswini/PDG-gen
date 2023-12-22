import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int n = Integer.valueOf(sc.readLine());
	    for(int i=0; i<n; i++){
		String[] st = sc.readLine().split(":");
		double a = Double.valueOf(st[0]);
		double b = Double.valueOf(st[1]);
		a = (a+b/60.0)*30.0;
		b *= 6.0;
		double c = Math.abs(a-b);
		if(c>180.0)
		    c = 360.0-c;
		if(c<30.0)
		    System.out.println("alert");
		else if(c<90.0)
		    System.out.println("warning");
		else
		    System.out.println("safe");
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}