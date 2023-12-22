import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int n = Integer.valueOf(sc.readLine());
	    for(int i=0; i<n; i++){
		int up=0, down=0, k = Integer.valueOf(sc.readLine());
		String[] sp = sc.readLine().split(" ");
		int[] map = new int[k];
		for(int j=0; j<k; j++)
		    map[j] = Integer.valueOf(sp[j]);
		for(int j=0; j<k-1; j++){
		    int dif = map[j+1]-map[j];
		    if(dif>up) up = dif;
		    if(dif+down<0) down = 0-dif;
		}
		System.out.println(up+" "+down);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}