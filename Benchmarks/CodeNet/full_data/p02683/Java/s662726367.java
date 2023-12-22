import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int max=Integer.parseInt(s[2]);
        int[] cost=new int[n];
        int[][] a=new int[n][m];

        for(int i=0;i<n;i++)
        {
            String[] s1=br.readLine().split(" ");
            cost[i]=Integer.parseInt(s1[0]);
            for(int j=1;j<=m;j++)
            {
                a[i][j-1]=Integer.parseInt(s1[j]);
            }

        }



        System.out.println(algo(a,cost,0,0,0,max));




    }

    public static int algo(int[][] a,int[] c,int i,int cost,int s,int skill)
    {
        if(s==skill)
        {
            return cost;
        }
        if(i>=a.length)
        {
            return Integer.MAX_VALUE;
        }

        int res=Integer.MAX_VALUE;
        int total_cost=0;
        int total_skill=0;
        int r1=algo(a,c,i+1,cost,s,skill);
        for(int j=0;j<a[i].length;j++)
        {
            total_cost+=c[i];
            total_skill+=a[i][j];
            int r2=algo(a,c,i+1,cost+c[i],s+a[i][j],skill);
            int r3=algo(a,c,i+1,total_cost,total_skill,skill);
            res=Math.min(res,Math.min(r1,Math.min(r2,r3)));
        }

        return res;







    }






}
