import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String st;
	    while((st=sc.readLine())!=null){
		String[] sp = st.split(",");
		int[] kyori = new int[12];
		for(int i=0; i<12; i++)
		    kyori[i] = Integer.valueOf(sp[i]);
		int s = 0;
		for(int i=0; i<10; i++)
		    s+=kyori[i];
		double t = (double)s/(kyori[10]+kyori[11]);
		double ss = t * (double)kyori[10];
		for(int i=0; i<10; i++){
		    ss -= (double)kyori[i];
		    if(ss==0){
			System.out.println(i+1);
			break;
		    }
		    else if(ss<0){
			System.out.println(i+1);
			break;
		    }
		}
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}