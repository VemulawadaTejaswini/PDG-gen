
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int n=Integer.valueOf(cmd[0]);
		cmd=br.readLine().split(" ");
		int[] cnt=new int[1000001];
		HashMap<Integer,Integer> check=new HashMap<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		int[] arr=new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.valueOf(cmd[i]);
			cnt[arr[i]]++;
			if(!map.containsKey(arr[i]))
			map.put(arr[i], 1);
			if(max<arr[i])
				max=arr[i];
		}
		for(int i=0;i<n;i++)
		{
			int x=arr[i];
			int y=max/arr[i];
			if(cnt[x]>1)
			{
				if(!check.containsKey(x))
					check.put(x,1);
			}
			for(int j=2;j<=y;j++)
			{
				if(map.containsKey(j*x))
				{
					if(!check.containsKey(j*x))
					check.put(j*x,1);
				}
			}
		}
		int ans=0;
		for(int i=0;i<n;i++)
		{
			if(!check.containsKey(arr[i]))
				ans++;
		}
		System.out.println(ans);
	}

}
