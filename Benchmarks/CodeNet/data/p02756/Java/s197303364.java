import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		int n = scan.nextInt();
		boolean reverse = false; 
		String s;
		
		for(int i = 0; i < n; i++){
			
			if(scan.nextInt() == 1)reverse = !reverse; 
			
			else if(reverse){
				if(scan.nextInt() == 2)sb.append(scan.next());
				else sb.insert(0, scan.next());
				
			}
			else{
				if(scan.nextInt() == 1)sb.append(scan.next());
				else sb.insert(0, scan.next());
			}
			
		}
		
		if(!reverse){
			s = sb.reverse().toString();
		}
		else s = sb.toString();
		
		System.out.println(s);
		
	}
}