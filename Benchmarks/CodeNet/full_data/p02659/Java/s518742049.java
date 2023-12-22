import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		double a = 0;
		double b = 1.00;
		long answer = 0;
		double rounds = Math.pow(10,15);
		while(in.hasNextDouble()){
		    a = in.nextDouble();
		    b = in.nextDouble();
		    if (a>=0 && a<=rounds) {
		        if(b>=0 && b<10){
		            answer = (long)(a*b);
		            System.out.println(answer);
		        }
		    }
		    
		}
	}
}