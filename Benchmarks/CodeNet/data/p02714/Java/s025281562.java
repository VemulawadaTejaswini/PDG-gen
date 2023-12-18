import java.io.*;
import java.util.*;

class Main
{
	static long count(String a, String b)
	{
		int m = a.length();
		int n = b.length();
		long lookup[][] = new long[m + 1][n + 1];
		for (int i = 0; i <= n; ++i)
			lookup[0][i] = 0;
		for (int i = 0; i <= m; ++i)
			lookup[i][0] = 1;
		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (a.charAt(i - 1) == b.charAt(j - 1))
					lookup[i][j] = lookup[i - 1][j - 1] +
							lookup[i - 1][j];

				else
					lookup[i][j] = lookup[i - 1][j];
			}
		}

		return lookup[m][n];
	}
	public static void main(String[] args) throws IOException
	{
		Scan in = new Scan();
		Print out = new Print();
		int n = in.scanInt();
		String s = in.scanString();
		long count1 = count(s, "RGB") + count(s, "RBG") + count(s, "GRB")
			+ count(s, "GBR") + count(s, "BGR") + count(s, "BRG");
		long count2 = 0;

		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n && (2*j-i) < n; j++) {
				if((s.charAt(i) != s.charAt(j)) && (s.charAt(j) != s.charAt(2*j-i)) && (s.charAt(i) != s.charAt(2*j-i))) {
					count2++;
				}
			}
		}
		count1 -= count2;
		out.println(count1);
		out.close();
	}
}

class Scan
{
	private byte[] buf=new byte[1024];
	private int index;
	private InputStream in;
	private int total;
	public Scan()
	{
		in=System.in;
	}
	public int scan()throws IOException
	{
		if(total<0)
			throw new InputMismatchException();
		if(index>=total)
		{
			index=0;
			total=in.read(buf);
			if(total<=0)
				return -1;
		}
		return buf[index++];
	}
	public int scanInt()throws IOException
	{
		int integer=0;
		int n=scan();
		while(isWhiteSpace(n))
			n=scan();
		int neg=1;
		if(n=='-')
		{
			neg=-1;
			n=scan();
		}
		while(!isWhiteSpace(n))
		{
			if(n>='0'&&n<='9')
			{
				integer*=10;
				integer+=n-'0';
				n=scan();
			}
			else throw new InputMismatchException();
		}
		return neg*integer;
	}
	public double scanDouble()throws IOException
	{
		double doub=0;
		int n=scan();
		while(isWhiteSpace(n))
			n=scan();
		int neg=1;
		if(n=='-')
		{
			neg=-1;
			n=scan();
		}
		while(!isWhiteSpace(n)&&n!='.')
		{
			if(n>='0'&&n<='9')
			{
				doub*=10;
				doub+=n-'0';
				n=scan();
			}
			else throw new InputMismatchException();
		}
		if(n=='.')
		{
			n=scan();
			double temp=1;
			while(!isWhiteSpace(n))
			{
				if(n>='0'&&n<='9')
				{
					temp/=10;
					doub+=(n-'0')*temp;
					n=scan();
				}
				else throw new InputMismatchException();
			}
		}
		return doub*neg;
	}
	public String scanString()throws IOException
	{
		StringBuilder sb=new StringBuilder();
		int n=scan();
		while(isWhiteSpace(n))
			n=scan();
		while(!isWhiteSpace(n))
		{
			sb.append((char)n);
			n=scan();
		}
		return sb.toString();
	}
	private boolean isWhiteSpace(int n)
	{
		if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
			return true;
		return false;
	}
}

class Print
{
	private final BufferedWriter bw;
	public Print()
	{
		this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
	}
	public void print(Object object)throws IOException
	{
		bw.append(""+object);
	}
	public void println(Object object)throws IOException
	{
		print(object);
		bw.append("\n");
	}
	public void close()throws IOException
	{
		bw.close();
	}
}