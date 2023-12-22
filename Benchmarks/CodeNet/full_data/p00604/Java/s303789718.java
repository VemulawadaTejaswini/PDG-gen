import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    while((st=sc.readLine())!=null){
		String[] sp = sc.readLine().split(" ");
		int[] ans = new int[sp.length];
		for(int i=0; i<sp.length; i++)
		    ans[i] = Integer.valueOf(sp[i]);
		Arrays.sort(ans);
		int sumnow = 0, sum = 0;
		for(int i : ans){
		    sumnow+=i;
		    sum+=sumnow;
		}
		System.out.println(sum);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}