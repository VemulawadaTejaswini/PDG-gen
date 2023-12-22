import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String sp = sc.readLine();
	    int[] map = new int[sp.length()];
	    int now = -1;
	    for(int i=0; i<sp.length()-1; i++){
		if(sp.charAt(i)=='(')
		    now++;
		else
		    now--;
		map[now]++;
	    }
	    long count = 0;
	    for(int i=0; map[i]!=0; i++)
		count += map[i]*(map[i]-1)/2;
	    System.out.println(count);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}