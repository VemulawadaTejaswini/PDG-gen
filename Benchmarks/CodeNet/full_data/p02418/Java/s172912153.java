package info.searchman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   String[] original =  br.readLine().split("");
   String[] serch =  br.readLine().split("");

   int flag = 1;
   

   if(flag == 1){

	   System.out.println("Yes");

   }else{
	   System.out.println("No");
   }

  }
}