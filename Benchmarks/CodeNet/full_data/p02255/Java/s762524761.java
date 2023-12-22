import java.util.*;
public class Main{
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 int j;
		 for(int x=0;x<n-1;x++)
			{
				System.out.print(a[x]+" ");
			}
		 System.out.print(a[n-1]);
			System.out.println();
		 for(int i=1;i<n;i++)
		 {
			 int t=a[i];
			for(j=i-1;j>=0;j--)
			{
				if(a[j]>t)
				{
					t=a[j+1];
					a[j+1]=a[j];
					a[j]=t;
				}
				else {
					break;
				}
			}
			a[j+1]=t;
			 for(int x=0;x<n-1;x++)
				{
					System.out.print(a[x]+" ");
				}
			 System.out.print(a[n-1]);
				System.out.println();
		 }
	}
}
