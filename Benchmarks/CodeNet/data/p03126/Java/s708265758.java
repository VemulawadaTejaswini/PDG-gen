import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        logic(sc);
    }
    
    public static void logic(Scanner sc)
    {
        int ans = 0;
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] mArr = new int[m+1];
        for(int i=1;i<=n;i++)
        {
            int ki = sc.nextInt();
            for(int j=1;j<=ki;j++)
            {
                mArr[sc.nextInt()]++;
            }
        }
        for(int i=0;i<mArr.length;i++)
            if(mArr[i]==n)
                ans++;
        
        sc.close();
        System.out.print(ans);
    }
}
