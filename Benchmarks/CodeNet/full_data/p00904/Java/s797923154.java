import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int itr = Integer.valueOf(sc.readLine());
	    for(int a=0; a<itr; a++){
		String[] st = sc.readLine().split(" ");
		int p = Integer.valueOf(st[0]);
		int q = Integer.valueOf(st[1]);
		int s = p*p+q*q;
		String out = "P";
		root:
		for(int m=1; m*m<s; m++)
		    for(int n=1; m*m+n*n<s; n++)
			if((m*p+n*q)%(m*m+n*n)==0 && (m*q-n*p)%(m*m+n*n)==0){
			    out = "C";
			    break root;
			}
		System.out.println(out);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}