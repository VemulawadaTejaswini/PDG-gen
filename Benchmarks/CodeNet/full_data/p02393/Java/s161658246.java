package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int c = Integer.parseInt(line[2]);
            
            if(a < b && b < c){
            	System.out.print(a);
            	System.out.print(" " +b);
            	System.out.print(" "+ c);
            }else if(a < c && c < b){
            	System.out.print(a);
            	System.out.print(" " +c);
            	System.out.print(" "+ b);
            }else if(b < a && a < c){
            	System.out.print(b);
            	System.out.print(" " +a);
            	System.out.print(" "+ c);
            }else if(b < c && c < a){
            	System.out.print(b);
            	System.out.print(" " +c);
            	System.out.print(" "+ a);
            }else if(c < b && b < a){
            	System.out.print(c);
            	System.out.print(" " +b);
            	System.out.print(" "+ a);
            }else if(c < a && a < b){
            	System.out.print(c);
            	System.out.print(" " +a);
            	System.out.print(" "+ b);
            }
		
	}
	}

}