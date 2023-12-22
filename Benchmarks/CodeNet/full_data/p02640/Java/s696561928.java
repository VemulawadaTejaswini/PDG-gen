/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
       	Scanner in = new Scanner(System.in);
       	int num , legs;
        num = in.nextInt();
        legs = in.nextInt();
        String ans = "No";
        int flag = 0;
      	for(int i=1 ; i<= num+1 ; i++) {
      	    int b = num - i;
      	    if(i*2 + 4*b == legs){
      	    	ans = "Yes";
      	    }
      	}
      	
        System.out.println(ans);

      	 


     	
	}
}