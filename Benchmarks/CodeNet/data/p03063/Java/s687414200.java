package atc;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		System.out.println(solve(str));
		
	}

	private static int solve(String str) {
		// TODO Auto-generated method stub
		int min=str.length();
		int white=0;
		int black=0;
		
		int[] arr=new int[str.length()+1];
		arr[arr.length-1]=0;
		
		for(char c:str.toCharArray())
			if(c=='.')
				white++;
		
		black=str.length()-white;
			
		
		
		
		for(int i=str.length()-1;i>=0;i--) {
			arr[i]=(str.charAt(i)=='.'?arr[i+1]+1:arr[i+1]);
		}
		

		
	
		min=Math.min(black, white);

		int cost=0;
		for(int i=0;i<str.length();i++) {	
			char c=str.charAt(i);
			if(c=='.') {
				--white;
				min=Math.min(black+cost, min);
				min=Math.min(min, white+cost);
				if(arr[i+1]==0) {

					return Math.min(cost,min);
				}
				
			}else {
				--black;
				++cost;
				min=Math.min(min, black+cost);
				min=Math.min(white+cost,min);
				if(arr[i+1]==0) {
					
					return min=Math.min(cost,min);
				}
			}
		}
		return min;
	}
}
