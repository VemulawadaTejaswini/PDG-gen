//package atcoder;
import java.util.*;
import java.lang.String;
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		int[][] a=new int[n][2];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
			a[i][0]=sc.nextInt();
			a[i][1]=i;
			
			
			
		}
		for(int i=0;i<n;i++)
		{
			int Min=i;
			for(int j=i;j<n;j++)
			{
				if(arr[Min].compareTo(arr[j])>0)
				{
					Min=j;
				}
				else if(arr[Min].compareTo(arr[j])==0)
				{
					if(a[Min][0]<a[j][0])
					{
						Min=j;
					}
					else
					{
						continue;
					}
				}
				else
				{
					continue;
					
				}
			}
			String temp1=arr[i];
			arr[i]=arr[Min];
			arr[Min]=temp1;
			int temp2=a[i][0];
			int temp3=a[i][1];
			a[i][0]=a[Min][0];
			a[i][1]=a[Min][1];
			a[Min][0]=temp2;
			a[Min][1]=temp3;
			
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i][1]+1);
		}
		
	

	}

}
