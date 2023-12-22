import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int n = 0;
    	int result[];
    	String at = "@";
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){
    	n = scan.nextInt();
    	result = new int[n];
    	for(int i = 0; i < n; i++){
    		int num = scan.nextInt();
    		result[num-1] = scan.nextInt();
    	}
    	int topkekka = 0;
    	int topnum = 0;
    	for(int k = 0; k < n;k++){
    		if(result[k] > topkekka){
    			topkekka = result[k];
    			topnum = k+1;
    		}
    	}
    	System.out.println(topnum + " " + topkekka);
    	
    	}
 }
}