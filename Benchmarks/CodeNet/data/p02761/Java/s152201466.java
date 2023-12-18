import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int flag=0;
		int n=in.nextInt();
		int m=in.nextInt();
		int c1=77,c2=77,c3=77;
		if(m==0&&n==1) System.out.print(0);
		else if(m==0&&n==2) System.out.print(10);
		else if(m==0&&n==3) System.out.print(100);
	/*	else if(n==1)
		{
			for(int i=0;i<m;i++)
			{
				int s=in.nextInt();
				int c=in.nextInt();
				if((s==1&&c1==77)||(s==1&&c==c1))
				{
					if(c==0) flag=1;
					else c1=c;
				}
			}
		}*/
		else
		{
			for(int i=0;i<m;i++)
			{
				int s=in.nextInt();
				int c=in.nextInt();
				if((s==1&&c1==77)||(s==1&&c==c1))
				{
					if(c==0) flag=1;
					else c1=c;
				}
				else if((s==2&&c2==77)||(s==2&&c==c2)) c2=c;
				else if((s==3&&c3==77)||(s==3&&c==c3)) c3=c;
				else flag=1;
			}
			if(flag==1) System.out.print(-1);
			else
			{
				for(int i=1;i<=n;i++)
			{
					if(i==1&&c1!=77) System.out.print(c1);
					if(i==1&&c1==77) System.out.print(1);
					if(i==2&&c2!=77) System.out.print(c2);
					if(i==2&&c2==77) System.out.print(0);
					if(i==3&&c3!=77) System.out.print(c3);
					if(i==3&&c3==77) System.out.print(0);
			    }
			}
		}
        in.close();
	}
}