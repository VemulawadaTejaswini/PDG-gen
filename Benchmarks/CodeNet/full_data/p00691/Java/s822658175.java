import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    while(true){
		int z = Integer.valueOf(sc.readLine());
		if(z==0)
		    break;
		int mulz = z*z*z;
		int[] ok = new int[mulz];
		for(int i=1; i<z; i++)
		    for(int j=1; j<z; j++)
			if(i*i*i+j*j*j<z*z*z)
			    ok[i*i*i+j*j*j]=1;
		for(int i=mulz-1; i>=0; i--)
		    if(ok[i]==1){
			System.out.println(mulz-i);
			break;
		    }	
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}