package hello;

import java.util.Scanner;

public class Main {
	
		private static Scanner input;

		public static void main(String[]args){
				  input = new Scanner(System.in);
				  int a = input.nextInt();
				  int b = input.nextInt();
			if(a<b){
			System.out.println("a < b");
			}
			else if (a>b){
			
			System.out.println("a > b");}
			else{
			

			System.out.println("a == b");		
			}
		}
	}