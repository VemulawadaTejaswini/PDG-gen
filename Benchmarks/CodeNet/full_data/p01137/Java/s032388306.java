import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line;
	int energy,x,y,z,conse;
	int barrier,maxb=1000000;
	try{
	    while(0!=(energy=Integer.valueOf(br.readLine()))){
		conse = energy;
		if(Math.pow(z=(int)Math.pow(energy,1.0/3.0),3.0)<=energy&&z>1.0){
		    energy-=(z*z*z);
		    barrier = z;
		}else {
		    z = 0;
		    barrier = 0;
		}
		do{
		    if(Math.pow(y=(int)Math.pow(energy,1.0/2.0),2.0)<=energy&&y>1.0){
			energy-=(y*y);
		    }else y = 0;
		    x = energy;
		    barrier = x+y+z;
		    if(barrier<maxb)maxb = barrier;
		    z--;
		    energy = conse-(z*z*z);
		}while(z>=0);
		System.out.println(Integer.toString(maxb));
		maxb = 1000000;
	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}