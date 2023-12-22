import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    
    public static void main(String args[])throws IOException
    {
	
	while(true)
	    {	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] elements = in.readLine().split(" ");
		int N,M;
		double P;
		N = Integer.parseInt(elements[0]);
		M = Integer.parseInt(elements[1]);
		P = Double.parseDouble(elements[2]);
		
		if(N == 0 && M == 0 && P == 0)
		    break;

		int the_number=0,sum;
		sum = 0;
		for(int i=0;i<N;i++)
		    {
			int X;
			X = Integer.parseInt(in.readLine()); 
			sum += X*100;
			if(i+1 == M)
			    {
				the_number = X;
			    }
		    }
		if(the_number == 0)
		    System.out.println(0);
		else
		    System.out.println((int)(sum-(sum*(P*0.01) ) )/the_number );
	    }	



    }
    
}