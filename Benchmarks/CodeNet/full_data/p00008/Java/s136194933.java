import java.util.*;
import java.io.*;

class November7of2017 {

	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s; 
		while( !(s=br.readLine()).equals(" ")) 
		{
			int n = Integer.parseInt(s);
			System.out.println(getComb(n));
		}
	}
	public static int getComb( int n) 
	{
		int total = 0;
		for( int i=0;i<=9;i++) 
		{
			for(int j =0; j<=9;j++) 
			{
				for(int k = 0;k<=9;k++) 
				{
					for( int l = 0; l<=9;l++) 
					{
						if((i+j+k+l) == n) 
						{
							total++;
						}
					}
				}
			}
		}
		return total;

	}
}