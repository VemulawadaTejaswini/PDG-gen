import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

class Main
{
 public static void main(String[] args) throws IOException
 {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String str = br.readLine();
     String[] abc = str.split(" ", 0);
     int a = Integer.parseInt(abc[0]);
     int b = Integer.parseInt(abc[1]);
     int c = Integer.parseInt(abc[2]);

     if(a < b){
    	 if (b<c){   	 
         System.out.println(a+" "+b+" "+c);}
    	 else if(a<c){
    		 System.out.println(a+" "+c+" "+b);}
    	 else{
    		 System.out.println(c+" "+a+" "+b);}
    	 }    	 
     else {
    	 if (a<c){   	 
             System.out.println(b+" "+a+" "+c);}
    	 else if(b<c){
    		 System.out.println(b+" "+c+" "+a);}
    	 else{
    		 System.out.println(c+" "+b+" "+a);}
 }
}
}