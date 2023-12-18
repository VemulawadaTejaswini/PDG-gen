import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Stack;

public class Main {
		static  Scanner scn=new Scanner(System.in);
		static int count=0;
		public static void main(String[] args) {
			
			int n=scn.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=scn.nextInt();
			}
			int count=0;
			TreeMap<Integer,Integer>map=new TreeMap<Integer, Integer>();
			for(int i=0;i<n;i++)
			{
				if(map.containsKey(arr[i]))
					map.put(arr[i], map.get(arr[i])+1);
				else map.put(arr[i],1);
			}
			for(int i=0;i<n;i++)
			{
				if(i==0)
					System.out.println(n);
				if(i>0)
				{
					if(map.size()>i)
						System.out.println(map.size()/(i+1));
				}
			}
			for(int i=map.size();i<n;i++)
				{System.out.println("0");}
		}
		public static int gcd(int a,int b)
		{
			if(a==0)return b;
			int l= gcd(b%a,a);
			return l;
		}

		
}
