/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
       	Scanner in = new Scanner(System.in);
       	int num , legs;
        num = in.nextInt();
        legs = in.nextInt();
      	
      	if(legs /2 <= num || legs /4 <= num)
			System.out.println("Yes");
      	else
            System.out.println("No");
	}
}