import java.io.*;
import java.math.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    String st = sc.readLine();
	    int n = Integer.valueOf(st);
	    for(int i=0; i<n; i++){
		String[] pt = sc.readLine().split(" ");
		double[] a = new double[6];
		for(int j=0; j<6; j++)
		    a[j] = Double.valueOf(pt[j]);
		if((a[2]+a[5]) < Math.sqrt(Math.pow((a[4]-a[1]),2)+Math.pow((a[3]-a[0]),2)))
		    System.out.println(0);
		else if(4.0*(Math.pow((a[4]-a[1]),2)+Math.pow((a[3]-a[0]),2)) < Math.pow((a[2]-a[5]),2) && (a[2]>a[5]))
		    System.out.println(2);
		else if(4.0*(Math.pow((a[4]-a[1]),2)+Math.pow((a[3]-a[0]),2)) < Math.pow(Math.abs(a[2]-a[5]),2) && (a[2]<a[5]))
		    System.out.println(-2);
		else
		    System.out.println(1);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}