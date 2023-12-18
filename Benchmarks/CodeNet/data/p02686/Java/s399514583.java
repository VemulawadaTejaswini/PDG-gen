
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int n=Integer.valueOf(cmd[0]);
		int[][] arr=new int[n][2];
		for(int i=0;i<n;i++)
		{
			StringBuilder s=new StringBuilder(br.readLine());
			Stack<Character> st=new Stack<>();
			int cnt=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='(')
					st.push('(');
				else
				{
					if(st.empty())
						cnt++;
					else
						st.pop();
				}
			}
			arr[i][1]=st.size();
			arr[i][0]=cnt;
		}
		StringBuilder f=new StringBuilder("");
		for(int i=0;i<n;i++)
		{
			if(arr[i][0]==0)
			{
				for(int j=0;j<arr[i][1];j++)
				{
					f=f.append("(");
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i][1]==0)
			{
				for(int j=0;j<arr[i][0];j++)
				{
					f.append(")");
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i][1]!=0 && arr[i][0]!=0)
			{
				for(int j=0;j<arr[i][0];j++)
				{
					f.append(")");
				}
				for(int j=0;j<arr[i][1];j++)
				{
					f.append("(");
				}
			}
		}
		Stack<Character> st=new Stack<>();
		int b=0;
		for(int i=0;i<f.length();i++)
		{
			if(f.charAt(i)=='(')
				st.push('(');
			else
			{
				if(st.empty())
				{
					b=1;
					break;
				}
				else
					st.pop();
			}
		}
		if(b==1 || st.size()!=0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}

}
