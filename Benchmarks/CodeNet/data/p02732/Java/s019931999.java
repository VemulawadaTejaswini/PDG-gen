import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		HashMap<Integer,Long> map=new HashMap<>();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			int val=s.nextInt();
			
			arr[i]=val;
			
			if(map.containsKey(val))
			{
				map.put(val, map.get(val)+1);
			}
			else
			{
				map.put(val, 1l);
			}
		}
		
		long total=0;
		
		for(Map.Entry<Integer, Long> entry: map.entrySet())
		{
			long val=entry.getValue();
			
			total=total+(val*(val-1))/2;
		}
		
		for(int i=0;i<n;i++)
		{
			long ans=total-map.get(arr[i])+1;
			System.out.println(ans);
		}
		
		
	}
	
}