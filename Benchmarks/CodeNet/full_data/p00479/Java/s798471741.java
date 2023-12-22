import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int N = Integer.valueOf(sc.readLine());
	    int K = Integer.valueOf(sc.readLine());
	    for(int i=0; i<K; i++){
		String[] st = sc.readLine().split(" ");
		int x = Integer.valueOf(st[0]);
		int y = Integer.valueOf(st[1]);
		if(x>(N+1)/2)		
		    x = N-x+1;
		if(y>(N+1)/2)
		    y = N-y+1;
		int min = Math.min(x,y);
		min%=3;
		if(min==0)
		    min=3;
		System.out.println(min);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}