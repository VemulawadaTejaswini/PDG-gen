import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void main(String[] a) throws IOException {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int zure = 1;
	String fukugou = "";
		char[] c = sentence.toCharArray();
		int zurek = 1;
		while(sentence != null){
			fukugou = "";
			for(int i = 0;i < sentence.length();i++){
				  for(int k =0; k < 26;k++){
					  if(k+1 >= 26){
							  k = k-26;
						  }
					  if(Character.isAlphabetic(c[i])){
						  if(c[i] == abc[k]){
						  int kzure = k +zure;
						  if(k+zure >=26){
							  kzure = k+zure-26;
						  }
						  fukugou = fukugou + abc[kzure];
						  break;
					  }
					  }else{
						  fukugou = fukugou + c[i];
						  break;
					  }

				  }  
			}
		
			if(fukugou.contains("this") || fukugou.contains("the") || fukugou.contains("that")){
					  System.out.print(fukugou);
					  break;
				  }else{
					  zure = zure +1;
				  }
		
		}
	}
}