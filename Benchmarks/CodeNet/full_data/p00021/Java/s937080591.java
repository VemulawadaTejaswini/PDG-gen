import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		line=input.readLine();
		int a = Integer.parseInt(line);
		StringTokenizer tokenizer;
		double[] x= new double[4];
		double[] x2= new double[2];
		double[] y= new double[4];
		double[] y2= new double[2];
		for(int i=0;i < a; i++){
			tokenizer = new StringTokenizer(input.readLine());
			for(int j=0;j < 4; j++ ){
				x[j]=Double.parseDouble(tokenizer.nextToken());
				y[j]=Double.parseDouble(tokenizer.nextToken());
			}
			for(int j=0;j < 2; j++ ){
				x2[j]=x[2*j]-x[2*j+1];
				y2[j]=y[2*j]-y[2*j+1];	
			}
			if(y2[0]==0 & y2[1]==0)	{
				System.out.println("YES");
			}else{
				if(x2[0]/y2[0]==x2[1]/y2[1]) {
					System.out.println("YES");
				}else{		
					System.out.println("NO");
				}
			}
		}	
	}
}	
		