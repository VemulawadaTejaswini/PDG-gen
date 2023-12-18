import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        char arr[][] = new char[n][m];
        int mod = 1000000007;
        for(int i=0;i<n;i++)
        {
            String str = sc.next();
            for(int j=0;j<m;j++)
            {
                arr[i][j]=str.charAt(j);
            }
        }
        boolean flag = false;
        int res[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            if(flag==true)
            {
                res[i][0]=0;
            }
            else
            {
            if(arr[i][0]=='#')
            {
                flag=true;
                res[i][0]=0;
            }
            else{
                res[i][0]=1;
            }
            }
        }
        flag = false;
        for(int i=0;i<m;i++)
        {
            if(flag==true)
            {
                res[0][i]=0;
            }
            else
            {
            if(arr[0][i]=='#')
            {
                flag=true;
                res[0][i]=0;
            }
            else{
                res[0][i]=1;
            }
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(arr[i][j]=='#')
                {
                    res[i][j]=0;
                }
                else{
                    res[i][j]= (res[i-1][j]%mod + res[i][j-1]%mod)%mod;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
        System.out.println(Arrays.toString(res[i]));
        }
        System.out.println(res[n-1][m-1]);
    }
}