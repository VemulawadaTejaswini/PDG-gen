import java.util.*;
public class Main
  {
    public static void main(String[]args)
    {
     Scanner s=new Scanner(System.in);
     int r=s.nextInt();
     int c=s.nextInt();
     char a[][]=new char[r][c];
     int count=0;
     for(int i=0;i<r;i++)
     {
      for(int j=0;j<c;j++)
       {
        a[i][j]=s.next().charAt(0);
       }
     }
    int dp[][]=new int[r][c];
    for(int j=0;j<c;j++)
     {
      if(a[0][j]=='#')
       {
        count++;
        dp[0][j]=count;

       }
       else
        dp[0][j]=count;
   }
   count=0;
        for(int i=0;i<r;i++)
     {
      if(a[i][0]=='#')
       {
 count++;
        dp[i][0]=count;
       
       }
      else
         dp[i][0]=count;
   }

for(int i=1;i<r;i++)
  {
    for(int j=1;j<c;j++)
     {
       if(a[i][j]!='#')
      {
       dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+1;
       }
       else
       {
        dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1]);
        }
     }
}

System.out.println(dp[r-1][c-1]);
}
}
