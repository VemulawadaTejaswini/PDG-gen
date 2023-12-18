import java.io.*;
import java.util.*;
//import javafx.util.Pair;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		
		int A[]=new int[N];		

		for(int i=0;i<M;i++)
		{
			s=br.readLine().split(" ");
			int pos = Integer.parseInt(s[0]);
			int num =Integer.parseInt(s[1]);
			A[pos-1]=num;			
		}
		
		
		if(N>=2 && A[0]==0)
			out.println(-1);
		else
		{
			for(int i=0;i<N;i++)
				out.print(A[i]);
			out.println();
		}
		
	}
	
	
}


