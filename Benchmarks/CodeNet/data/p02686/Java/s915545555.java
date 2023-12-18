
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int n=Integer.valueOf(cmd[0]);
		ArrayList<int[]> ar1=new ArrayList<>();
		ArrayList<int[]> ar2=new ArrayList<>();
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
			if(st.size()>=cnt)
				ar1.add(new int[] {cnt,st.size()});
			else
				ar2.add(new int[] {cnt,st.size()});
		}
		StringBuilder f=new StringBuilder("");
		ar1.sort(new Comparator<int[]>() {
			public int compare(int[]a,int[]b)
			{
				if(a[0]>b[0])
					return 1;
				else if(a[0]<b[0])
					return -1;
				else
				{
					return b[1]-a[1];
				}
			}
		});
		ar2.sort(new Comparator<int[]>() {
			public int compare(int[]a,int[]b)
			{
				if(a[1]>b[1])
					return -1;
				else if(a[1]<b[1])
					return 1;
				else
				{
					return a[0]-b[0];
				}
			}
		});
		for(int i=0;i<ar1.size();i++)
		{
			for(int j=0;j<ar1.get(i)[0];j++)
			{
				f=f.append(")");
			}
			for(int j=0;j<ar1.get(i)[1];j++)
			{
				f=f.append("(");
			}
		}
		for(int i=0;i<ar2.size();i++)
		{
			for(int j=0;j<ar2.get(i)[0];j++)
			{
				f=f.append(")");
			}
			for(int j=0;j<ar2.get(i)[1];j++)
			{
				f=f.append("(");
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
