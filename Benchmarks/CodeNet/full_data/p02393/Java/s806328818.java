import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
		String A,B,C;
		int a,b,c;
		
		Scanner in = new Scanner(System.in);
		
		A = in.next();
		B = in.next();
		C = in.next();
		
		a = Integer.parseInt(A);
		b = Integer.parseInt(B);
		c = Integer.parseInt(C);
		
		if(a < b && b < c){
			System.out.println(a + " " + b + " " +c);
		}else if(a < c && c < b){
			System.out.println(a + " " + c + " " +b);
		}else if(b < a && a < c){
			System.out.println(b + " " + a + " " +c);
		}else if(b < c && c < a){
			System.out.println(b + " " + c + " " +a);
		}else if(c < a && a < b){
			System.out.println(c + " " + a + " " +b);
		}else if(c < b && b < a){
			System.out.println(c + " " + b + " " +a);
		}
	}
}