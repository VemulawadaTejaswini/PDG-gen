import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			char ch[]=in.next().toCharArray();
			int a=0;
			int b=0;
			int c=0;
			int I=0;
			while(ch[I]!='+')
			{
				++a;
				++I;
			}
			++I;
			while(ch[I]!='=')
			{
				++b;
				++I;
			}
			++I;
			while(I!=ch.length)
			{
				++c;
				++I;
			}

			char A[]=new char[a];
			char B[]=new char[b];
			char C[]=new char[c];
			char x[]=new char[a];
			char y[]=new char[b];
			char z[]=new char[c];
			for(int i=0;i<a;i++)
				A[i]=ch[i];
			for(int i=0;i<b;i++)
				B[i]=ch[i+a+1];
			for(int i=0;i<c;i++)
				C[i]=ch[i+a+b+2];
			for(int i=0;i<a;i++)
				x[i]=A[a-i-1];
			for(int i=0;i<b;i++)
				y[i]=B[b-i-1];
			for(int i=0;i<c;i++)
				z[i]=C[c-i-1];
			
			int ans[]=new int[c];
			int X=-1;
			for(int i=0;i<10;i++)
			{
				int index1=0;
				int index2=0;
				int index3=0;
				boolean digit=false;
				boolean judge=false;
				int aa=0;
				int bb=0;
				for(;;)
				{
					if(index1<a)
					{
						if(x[index1]!='X')
							aa=(int)(x[index1]-'0');
						else
							aa=i;
					}
					else
						aa=0;

					if(index2<b)
					{
						if(y[index2]!='X')
							bb=(int)(y[index2]-'0');
						else
							bb=i;
					}
					else
						bb=0;
					int e=aa+bb;
					if(digit)
					{
						e++;
						digit=false;
					}
					if(e>=10)
						digit=true;
					//System.out.println(aa+" "+bb+" e="+e+"---"+index1+" "+index2);
					ans[index3]=e%10;
					++index1;
					++index2;
					++index3;
					if(index3==c)
						break;
				}
				for(int j=0;j<c;j++)
				{
					if(z[j]!='X'&&ans[j]==Integer.valueOf(z[j]-'0'))
						judge=true;
					else if(z[j]=='X'&&ans[j]==i)
						judge=true;
					else
					{
						judge=false;
						break;
					}
				}
				
				if(judge)
				{
					X=i;
					break;
				}
			}
			System.out.println(X==-1 ? "NA":X);
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}