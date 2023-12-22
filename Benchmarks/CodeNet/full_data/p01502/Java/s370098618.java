import java.util.*;
import java.io.*;

class Main
{

    public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(in.readLine());
	int[][] C = new int[N][N];
	String line;
	for(int i=0;i<N;i++)
	    {
		line = in.readLine();
		for(int j=0;j<N;j++){
		    String[] elements = line.split(" ");
		    C[i][j] = Integer.parseInt(elements[j]);
		}
	    }
	      
	    
	long cost = 0;

	for(int i=0;i<N;i++)
	    for(int j=i+1;j<N;j++)
		cost += Math.min(C[i][j],C[j][i]);

	System.out.println(cost);
    }

}