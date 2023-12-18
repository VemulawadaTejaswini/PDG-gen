import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n = scan.nextInt();
		boolean reverse = false; 
		
		for(int i = 0; i < n; i++){
			
			if(scan.nextInt() == 1)reverse = !reverse; 
			
			else if(reverse){
				if(scan.nextInt() == 2)s = scan.next() + s;
				else s = s + scan.next();
				
			}
			else{
				if(scan.nextInt() == 1)s = scan.next() + s;
				else s = s + scan.next();
			}
			
		}
		
		if(reverse){
		StringBuffer sb = new StringBuffer(s);
		s = sb.reverse().toString();
		}
		
		System.out.println(s);
		
	}
}