import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] inp=br.readLine().split(" ");
		int N=Integer.parseInt(inp[0]);
		int M=Integer.parseInt(inp[1]);
		long K=Long.parseLong(inp[2]);
		String[] stack1=br.readLine().split(" ");
		String[] stack2=br.readLine().split(" ");
		long[] desk1=new long[N];
		long[] desk2=new long[M];
		for(int p=0;p<N;p++)
			desk1[p]=Long.parseLong(stack1[p]);
		for(int q=0;q<M;q++)
			desk2[q]=Long.parseLong(stack2[q]);
		int i=0;
		int j=0;
		int minutes=0;
		int books=0;
		while(i<N && j<M && minutes<=K)
		{
			if(desk1[i]<desk2[j])
			{
				//K=K-desk1[i];
				minutes+=desk1[i];
				if(minutes>K)
					break;
				//System.out.println("Read: "+desk1[i]);
				i++;
				books++;
			}
			else if(desk2[j]<desk1[i])
			{
				//K=K-desk2[j];
				minutes+=desk2[j];
				if(minutes>K)
					break;
				//System.out.println("Read: "+desk2[j]);
				j++;
				books++;
			}
			else
			{
				if(desk1[i+1]<desk2[j+1])
				{
					minutes+=desk1[i];
					if(minutes>K)
						break;
					//System.out.println("Read: "+desk1[i]);
					i++;
					books++;
				}
				else
				{
					minutes+=desk2[j];
					if(minutes>K)
						break;
					//System.out.println("Read: "+desk2[j]);
					j++;
					books++;
				}
			}
			//System.out.println(minutes+" "+K);
		}
		if(minutes<=K)
		{
			if(i<N)
			{
				while(i<N && minutes<=K)
				{
					//K=K-desk1[i];
					minutes+=desk1[i];
					if(minutes>K)
						break;
					i++;
					books++;
				}	
			}
			else if(j<M)
			{
				while(j<M && minutes<=K)
				{
					//K=K-desk2[j];
					minutes+=desk2[j];
					if(minutes>K)
						break;
					j++;
					books++;
				}
			}
		}
		System.out.println(books);	
			
	}

}
