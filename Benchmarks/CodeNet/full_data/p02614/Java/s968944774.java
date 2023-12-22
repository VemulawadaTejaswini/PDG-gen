import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
	static ArrayList<ArrayList<Integer>> list2=new ArrayList<>();
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int r=s.nextInt();
		int c=s.nextInt();
		int k=s.nextInt();
		
		char[][] arr=new char[r][c];
		
		for(int i=0;i<r;i++)
		{
			String str=s.next();
			
			for(int j=0;j<c;j++)
			{
				arr[i][j]=str.charAt(j);
			}
		}
		
		int black=0;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]=='#')
				{
					black++;
				}
			}
		}
		
		int ans=0;
		
		ArrayList<Integer> temp=new ArrayList<>();
		
		find(0,r,temp,0);
		find(0,c,temp,1);
		
		for(int i=0;i<list1.size();i++)
		{
			for(int j=0;j<list2.size();j++)
			{
				int[][] visited=new int[r][c];
				
				ArrayList<Integer> row=list1.get(i);
				ArrayList<Integer> col=list2.get(j);
				
				int count=0;
				
				for(int l=0;l<row.size();l++)
				{
					int q=row.get(l);
					
					for(int m=0;m<c;m++)
					{
						if(visited[q][m]==0&&arr[q][m]=='#')
						{
							count++;
						}
						
						visited[q][m]=1;
					}
				}
				
				for(int l=0;l<col.size();l++)
				{
					int q=col.get(l);
					
					for(int m=0;m<r;m++)
					{
						if(visited[m][q]==0&&arr[m][q]=='#')
						{
							count++;
						}
						
						visited[m][q]=1;
					}
				}
				
				if(black-count==k)
					ans++;
				
			}
		}
		
		System.out.println(ans);
		
	}
	
	public static void find(int curr,int r,ArrayList<Integer> temp,int which)
	{
		if(curr==r)
		{
			ArrayList<Integer> add=new ArrayList<>();
			
			for(int i=0;i<temp.size();i++)
			{
				add.add(temp.get(i));
			}
			
			if(which==0)
				list1.add(add);
			else
				list2.add(add);
			
			return;
		}
		
		temp.add(curr);
		find(curr+1,r,temp,which);
		
		if(temp.size()>0)
		temp.remove(temp.size()-1);
		
		find(curr+1,r,temp,which);
		
	}
	
}