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
			for(int i=0;i<n-2;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					for(int k=j+1;k<n;k++)
					{
						if(arr[i]<arr[j]+arr[k] && arr[j]<arr[i]+arr[k]&&arr[k]<arr[i]+arr[j])
							count++;
							
					}
				}
			}
			System.out.println(count);
		}
		public static int gcd(int a,int b)
		{
			if(a==0)return b;
			int l= gcd(b%a,a);
			return l;
		}

		
}
