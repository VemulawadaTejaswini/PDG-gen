import java.util.Scanner;

public class Main
{
 
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);

			int n=sc.nextInt();
            int []h=new int [n];
            int [] ans=new int [n];
            for(int i=0;i<n;i++)
            {
                h[i]=sc.nextInt();
            }
            ans[0]=0;
            ans[1]=ab(h[0]-h[1]);
           for(int i=2;i<n;i++)
            {
                ans[i]=min(ab(h[i]-h[i-1])+ans[i-1],ab(h[i]-h[i-2])+ans[i-2]);
            }	
            System.out.println(ans[n-1]);
    }
    public static int ab(int n)
    {
        if(n<0)
            return -n;
        return n;
    }
    public static int min(int a,int b)
    {
        if(a<b)
            return a;
        return b;
    }
   
 
}
