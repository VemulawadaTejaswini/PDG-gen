
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int w;
		while(a > b || b > c){
			if(a > b){
				w = a;
				a = b;
				b = w;
			}else if(b > c){
				w = b;
				b = c;
				c = w;
			}else if(a > b){
				w = a;
				a = b;
				b = w;
			}
		}
			System.out.println(a + " " + b + " " + c);
	}
}