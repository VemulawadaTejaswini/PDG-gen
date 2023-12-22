import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=n-1;j++)
            {
                for(int k=1;k<=n-1;k++)
                {
                    
                    if(i*j+k==n)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}