import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
	
public class Main
{ 		
	private static class Pair implements Comparable<Pair>
	{
		int x;
		int y;
		public Pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		@Override
		public int compareTo(Pair p) {
			if(this.x<p.x)
				return -1;
			if(this.x>p.x)
				return 1;
			if(this.y<p.y)
				return -1;
			if(this.y>p.y)
				return 1;
			return 0;
		}
		public String toString()
		{
			return "("+x+","+y+")";
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int n = scan.nextInt();
		Pair[] arr1 = new Pair[n];
		Pair[] arr2 = new Pair[n];
		
		for(int i=0;i<n;i++)
			arr1[i] = new Pair(scan.nextInt(),scan.nextInt());
		
		for(int i=0;i<n;i++)
			arr2[i] = new Pair(scan.nextInt(),scan.nextInt());
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int count = 0;
		
		for(int i=0,j=0;j<n;)
		{
			if(arr1[i].compareTo(arr2[j])<0)
			{
				count++;
				i++;
				j++;
			}
			else
				j++;		
		}
		System.out.println(count);
	}
}
