import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		
		s=br.readLine().split(" ");
		int R = Integer.parseInt(s[0]);
		int S = Integer.parseInt(s[1]);
		int P = Integer.parseInt(s[2]);
		
		String st=br.readLine();
		char t[]=st.toCharArray();
		char moves[]=new char[N];
		
		long ans=0;
		
		/*logic: if I can play winning move then I play it, if not then I play a move 
		which doesn't obstruct the (i+K)th move, since be it is a loss or draw, 
		there are no poins associated with it.*/
		
		
		for(int i=0;i<N;i++)
		{
			if(i<K)
			{
				if(t[i]=='r')
				{
					ans+=P;
					moves[i]='p';
				}	
				else if(t[i]=='p')
				{
					ans+=S;
					moves[i]='s';
				}	
				else if(t[i]=='s')
				{
					ans+=R;
					moves[i]='r';
				}
			}
			
			else //i>K
			{
				if(t[i]=='r' && moves[i-K]!='p')
				{
					ans+=P;
					moves[i]='p';
				}	
				else if(t[i]=='p' && moves[i-K]!='s')
				{
					ans+=S;
					moves[i]='s';
				}	
				else if(t[i]=='s' && moves[i-K]!='r')
				{
					ans+=R;
					moves[i]='r';
				}
				
				else
					moves[i]='X';//dummy value, means I play a move that doesnt obstruct (i+K)th move
			}	
		}
		
		out.println(ans);
	
	}
}


