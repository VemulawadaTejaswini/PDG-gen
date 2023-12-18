import java.io.*;
import java.util.*;
public class Main
{
	ArrayList<String> list;
	int A,B,C,n,posab,posbc,posac,a,b,c;
	char choice[];
	String s[];
	private void solve()throws IOException
	{
		n=nextInt();
		A=nextInt();
		B=nextInt();
		C=nextInt();
		int ab=0,bc=0,ac=0;
		a=0;b=0;c=0;
		posab=0;posbc=0;posac=0;
		choice=new char[n+1];
		s=new String[n+1];
		for(int i=1;i<=n;i++)
		{
			s[i]=nextLine();
			if(s[i].equals("AB"))
			{
				posab=i;
				ab++;
			}
			else if(s[i].equals("AC"))
			{
				posac=i;
				ac++;
			}
			else
			{
				posbc=i;
				bc++;
			}
		}
		list=new ArrayList<>();
		if(ab%2==1)
			list.add("AB");
		else
			posab=0;
		if(ac%2==1)
			list.add("AC");
		else
			posac=0;
		if(bc%2==1)
			list.add("BC");
		else
			posbc=0;
		check(0);
		out.println("No");
	}
	void check(int idx)
	{
		if(idx==list.size())
		{
			if(a+A>=0 && b+B>=0 && c+C>=0)
			{
				out.println("Yes");
				char ab='B',ac='C',bc='C';
				for(int i=1;i<=n;i++)
				{
					if(i==posab || i==posbc || i==posac)
						out.println(choice[i]);
					else
					{
						switch(s[i])
						{
							case "AB":
							if(ab=='A')
								ab='B';
							else
								ab='A';
							out.println(ab);
							break;
							case "AC":
							if(ac=='A')
								ac='C';
							else
								ac='A';
							out.println(ac);
							break;
							case "BC":
							if(bc=='B')
								bc='C';
							else
								bc='B';
							out.println(bc);
							break;
						}
					}
				}
				out.close();
				System.exit(0);
			}
			return;
		}
		switch(list.get(idx))
		{
			case "AB":
			a++;
			b--;
			choice[posab]='A';
			check(idx+1);
			a-=2;
			b+=2;
			choice[posab]='B';
			check(idx+1);
			a++;
			b--;
			break;
			
			case "AC":
			a++;
			c--;
			choice[posac]='A';
			check(idx+1);
			a-=2;
			c+=2;
			choice[posac]='C';
			check(idx+1);
			a++;
			c--;
			break;
			
			case "BC":
			b++;
			c--;
			choice[posbc]='B';
			check(idx+1);
			b-=2;
			c+=2;
			choice[posbc]='C';
			check(idx+1);
			b++;
			c--;
			break;
		}
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws IOException
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws IOException{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws IOException{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws IOException{
		return br.readLine();
	}
	int nextInt()throws IOException{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws IOException{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws IOException{
		return Double.parseDouble(nextToken());
	}
}