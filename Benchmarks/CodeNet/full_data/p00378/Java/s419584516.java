import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();

        if(a>(b*2))
        {
            int n=x/500;
            ans=b*n;
            if (x%500!=0) { ans+=b;}
        }else
        {
            int n=x/1000;
            ans=a*n;
            if(x%1000!=0)
            {
                if (x%1000<=500) 
                {
                    if (a<b) {ans+=a;}
                    else {ans+=b;}
                }
                else {ans+=a;}
            }
        }

        System.out.println(ans);
    }
}
