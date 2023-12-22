import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String sp = sc.readLine();
	    int[] map = new int[sp.length()];
	    for(int i=0; i<sp.length(); i++)
		map[i] = sp.charAt(i)-')'+1;
	    int count=0;
	    for(int i=0; i<sp.length(); i++){
		int now = 0;
		for(int j=i+1; j<sp.length(); j++){
		    now += map[j];
		    if((j-i)%2==0 && now==(j-i)/2)
			count++;
		}
	    }
	    System.out.println(count);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}