import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	    String st;
	    while((st=s.readLine())!=null){
		int count = 0, n = Integer.valueOf(st);
		int[] x = new int[n+1];
		for(int i=2; i<=Math.sqrt(n); i++)
		    if(x[i]==0)
			for(int j=i*i; j<=n; j+=i)
			    x[j]=1;
		for(int i=2; i<=n; i++)
		    if(x[i]==0)
			count++;
		System.out.println(count);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}