
import java.util.*;
class Main {
    static int cnt = 0;
    private static void re(int i,int n,int v,int t,int s)
    {
        //i????????¨????????°?????°,n?????????????±?,v????´??????°???,s???????¨???°,t???????????§??§?????§????????°
        if(i==n)
        {
            for(int j=t+1; j<=9; j++)
            {
                int tempv=v+j;
                if(tempv==s)
                {
                    cnt++;
                    break;

                }
            }
        }
        else
        {
            for(int j=t+1; j<=9; j++)
            {
                int tempv = v+j;
                if(tempv<s)
                {
                    re(i+1,n,tempv,j,s);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int n = scan.nextInt();
            int s = scan.nextInt();
            if(n==0 && s==0)
            {
                break;
            }
            re(1, n, 0, -1, s);
            System.out.println(cnt);
        }
    }
}