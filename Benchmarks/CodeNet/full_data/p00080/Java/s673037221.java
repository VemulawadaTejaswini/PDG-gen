import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    while(true){
		double q = Double.valueOf(sc.readLine());
		if(q==-1)
		    break;
		double x = q/2.0;
		while(x*x*x-q >= 0.00001*q){
		    x -= (x*x*x-q)/(3.0*x*x);
		}
		System.out.println(x);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}