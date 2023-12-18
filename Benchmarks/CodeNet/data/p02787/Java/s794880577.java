//package AtCoder;
import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int n=sc.nextInt();
		Map<Integer,Integer> map=new HashMap<>();
		int[][] a=new int[n][h+1];
		
		for(int i=0;i<n;i++)
		{
			int damage=sc.nextInt();
			int points=sc.nextInt();
			a[i][0]=damage;
			map.put(damage, points);
		}
		
		for(int j=0;j<n;j++)
		{
			for(int i=1;i<=h;i++)
			{
				if(j==0)
				{
					a[j][i]=i/a[j][0]*map.get(a[j][0]);
					if(i%a[j][0]!=0)
						a[j][i]+=map.get(a[j][0]);
				}
				else
				{
					int temp1=i/a[j][0];
//					if(i%a[j][0]!=0)
//						temp1+=1;
					int min=Integer.MAX_VALUE;
					for(int t=0;t<=temp1;t++)
					{
						int x=t*a[j][0];
						min=Math.min(min,t*map.get(a[j][0])+a[j-1][i-x]);
					}
					
//					if(i%a[j][0]!=0)
//					{
//						min=min+Math.min(map.get(a[j][0]),a[j-1][i%a[j][0]]);
//					}
					
					a[j][i]=min;
					
				}
			}
		}
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<=h;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println(a[n-1][h]);
	}
	static int minimum(int a,int b,int c)
	{
		int min=Math.min(a,b);
		min=Math.min(min, c);
		return min;
	}

}
