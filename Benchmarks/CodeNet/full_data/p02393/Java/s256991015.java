package aizuonline.section2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	
		Scanner stdin = new Scanner(System.in);
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		
		int temp;
		
		if(b < a){
			temp = a;
			a = b;
			b = temp;
		} 
			
		if (c < b) {
		temp = b; 
		b = c;
		c = temp;
		}  
		
		if(b < a){
			temp = a;
			a = b;
			b = temp;
		} 
			
		System.out.print(a + " " + b + " " + c);
		
		
		
		stdin.close();
	}
	
}