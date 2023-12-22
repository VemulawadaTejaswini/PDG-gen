import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int data,key,sum;
	double sqrt;
	try{
	    while(0!=(data=Integer.valueOf(br.readLine()))){
		sqrt = Math.sqrt(data);
		if(sqrt == (key = (int)sqrt)){
		    sum = key;
		    key--;
		    if(key == 0)sum--;
		}
		else {
		    sum = 1;
		}
		for(;key > 1;key--){
		    if((data%key) == 0)sum += ((data/key) + key);
		}
		if(sum > data)System.out.println("abundant number");
		if(sum < data)System.out.println("deficient number");
		if(sum ==data)System.out.println("perfect number");
	    }
	    
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}