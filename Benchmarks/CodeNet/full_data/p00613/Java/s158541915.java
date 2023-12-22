import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    while(true){
		int K = Integer.valueOf(sc.readLine());
		if(K==0)
		    break;
		String[] st = sc.readLine().split(" ");
		int sum = 0;
		for(int i=0; i<K*(K-1)/2; i++)
		    sum+=Integer.valueOf(st[i]);
		System.out.println(sum/(K-1));
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}