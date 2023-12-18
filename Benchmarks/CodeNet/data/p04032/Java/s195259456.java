/*package whatever //do not write package name here */

import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;


class Main {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main (String[] args) {
		FastReader ob = new FastReader();
		String s = ob.next();
		if(s.length()==2){
		    if(s.charAt(0)==s.charAt(1)){
		        System.out.println(1+" "+2);
		        return;
		    }
		}
		for (int i=0;i<s.length()-2 ;i++ ) {
		    if(s.charAt(i)==s.charAt(i+1) || s.charAt(i)==s.charAt(i+2) || s.charAt(i+2)==s.charAt(i+1)){
		        System.out.println((i+1)+" "+(i+3));
		        return;
		    }
		}
	    System.out.println(-1+" "+-1);
	}
}