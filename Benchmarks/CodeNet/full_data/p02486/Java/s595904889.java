import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

	    int i, j, k, cnt=0;
	    while(true)
	    {
	        cnt=0;
	    	int n=sc.nextInt();
	    	int x=sc.nextInt();
	        if(n==0 && x==0)break;
	        
	        for(i=1;   i<=n; i++)
	        for(j=i+1; j<=n; j++)
	        for(k=j+1; k<=n; k++)
	        {
	            if(i+j+k == x)
	                cnt++;
	        }
	        System.out.println(cnt);
	    }
	}
}