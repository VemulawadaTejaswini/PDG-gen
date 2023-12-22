import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int a = 0;
		double b = 1.00;
		int answer = 0;
		double round = Math.pow(10,15);
		
		while(in.hasNextInt()){
		    a = in.nextInt();
		    b = in.nextDouble();
		    if (a>=0 && a<=round) {
		        if(b>=0 && b<=10){
		            answer = (int)(a*b);
		            System.out.println(answer);
		        }
		    }
		    
		}
	}
}