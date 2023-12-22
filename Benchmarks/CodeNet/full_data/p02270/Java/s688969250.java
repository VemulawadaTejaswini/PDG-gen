import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static final int N=100000;
	static final int K=50000;
	static int n,k;
	static int w[],t[];
	
	public static boolean check_load(int limit)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			if(limit<w[i])
			{
				return false;
			}
		}
			Arrays.fill(t,0);
			i=j=0;
			while(i<n && j<k)
			{
				if(t[j]+w[i]<limit)
				{
					t[j]+=w[i++];
				}
				else if(t[j]+w[i]==limit)
				{
					t[j++]+=w[i++];
				}
				else
				{
					j++;
				}
				
			}
			return(i==n)?true:false;
	}
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
        int i,l,u,a;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        k=scan.nextInt();
        w=new int [n];
        t=new int [k];
        for(i=0;i<n;i++)
        {
        	w[i]=scan.nextInt();
        }
        
        l=0;
        u=0;
        for(i=0;i<n;i++)
        {
        	u+=w[i];
        }
        while(u-l>1)
        {
        	a=(l+u)/2;
        	if (check_load(a))
        	{
        		u=a;
        	}
        	else
        	{
        		l=a;
        	}
        }
        System.out.println(u);
        
	}

}