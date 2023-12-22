//package ABC170;
import java.util.*;
import java.io.*;
import java.lang.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//24 11 8 3 16;
		Arrays.sort(a);
		
		boolean yes[]=new boolean[n];
		Arrays.fill(yes,true);
		for(int i=0;i<n;i++)
		{
			if(yes[i])
			{
				if(i<n-1 && a[i]==a[i+1])
				{
					yes[i]=false;
					yes[i+1]=false;
				}
				for(int j=i+1;j<n;j++)
				{
					if(a[j]%a[i]==0)
					{
						yes[j]=false;
					}
				}
			}
		}
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(yes[i])
			{
				count++;
			}
		}
		System.out.println(count);
		
		

	}

}
