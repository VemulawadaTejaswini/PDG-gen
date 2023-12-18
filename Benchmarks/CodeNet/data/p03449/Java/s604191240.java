import java.util.*;

class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a[][]=new int [2][n];
		int sum=0,s=0;
		int c=0,i;
		for(i=0;i<2;i++)
		for(int j=0;j<n;j++)
		a[i][j]=sc.nextInt();
		while(c<n)
		{
		sum=a[0][0];
		for(i=1;i<=c;i++)
		{
		    sum=sum+a[0][i];
		}
		for(i=c;i<n;i++)
		{
		    sum=sum+a[1][i];
		}
		s=Math.max(sum,s);
		c++;
		}
		System.out.println(s);
	}
}
		