
import java.io.*;
import java.util.*;
public class Main{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int n=Integer.valueOf(cmd[0]);
		int[] arr=new int[n];
		cmd=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.valueOf(cmd[i]);
		}
		HashMap<Integer,Integer> map1=new HashMap<>();
		HashMap<Integer,Integer> map2=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int x=i+arr[i];
			int y=i-arr[i];
			if(map1.containsKey(x))
				map1.replace(x,map1.get(x)+1);
			else
				map1.put(x,1);
			if(map2.containsKey(y))
				map2.replace(y,map2.get(y)+1);
			else
				map2.put(y,1);
		}
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int x=i+arr[i];
			int y=i-arr[i];
			if(map1.containsKey(y))
				ans=ans+map1.get(y);
			if(map2.containsKey(x))
				ans=ans+map2.get(x);
		}
		System.out.println(ans/2);
	}

}
