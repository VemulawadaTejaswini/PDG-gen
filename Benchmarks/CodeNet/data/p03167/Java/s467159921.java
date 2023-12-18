import java.util.Scanner;

public class Main
{

	public static void main(String args[]) throws Exception
	{		
		Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
		int w=sc.nextInt();
        long [][] ans=new long [h][w];
        char [][] c=new char [h][w];
        for(int i=0;i<h;i++)
        {
            String s=new String();
            s=sc.next();
            for(int j=0;j<w;j++)
            {
                c[i][j]=s.charAt(j);
            }
        }
        ans[0][0]=1;
        for(int j=1;j<w;j++)
        {
            if(c[0][j]=='.')
            {
                ans[0][j]=ans[0][j-1];
            }
            else
            {
                break;
            }
        }
        for(int j=1;j<h;j++)
        {
            if(c[j][0]=='.')
            {
                ans[j][0]=ans[j-1][0];
            }
            else
            {
                break;
            }
        }
        for(int i=1;i<h;i++)
        {
            for(int j=1;j<w;j++)
            {
                if(c[i][j]=='.')
                {
                    ans[i][j]=(ans[i-1][j]+ans[i][j-1])%1000000007;
                }
            }
        }
        System.out.println(ans[h-1][w-1]);
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