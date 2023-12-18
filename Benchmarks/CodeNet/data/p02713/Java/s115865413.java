/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
	     Scanner s=new Scanner(System.in);
    int k=s.nextInt();
    //String ss=s.next();
    long sum=0;
    for(int i=1;i<=k;i++){
        for(int j=1;j<=k;j++){
            for(int j1=1;j1<=k;j1++){
                sum+=gcd(gcd(i,j),j1);
            }
        }
        
    }
    //if(ss.contains("7"))
    System.out.println(sum);
    
	}
	public static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
          
        return gcd(b%a, a); 
    }
}