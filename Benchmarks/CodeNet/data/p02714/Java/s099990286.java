/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
	     Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String ss=s.next();
    long sum=0;
    int c=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(ss.charAt(i)!=ss.charAt(j)&&ss.charAt(j)!=ss.charAt(k)&&ss.charAt(i)!=ss.charAt(k)&&(j-i)!=(k-j))
                {
                    c++;
                }
            }
        }
        
    }
    //if(ss.contains("7"))
    System.out.println(c);
    
	}
	
}