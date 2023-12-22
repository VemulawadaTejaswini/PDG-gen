import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int weight = 0;
    	
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){
    	weight = scan.nextInt();
    	int[] omori = {1,2,4,8,16,32,64,128,256,512};
    	int keisan = weight;
    	for(int i = omori.length -1;i >= 0;i--){
    		if(keisan >= omori[i]){
    			keisan = keisan - omori[i];
    		}else{
    			omori[i] = 0;
    		}
    	}
    	for(int k = 0;k < omori.length;k++){
    		if(omori[k] > 0){
    			System.out.print(omori[k] + " ");
    		}
    	}
    	}
    	
    	}
 }