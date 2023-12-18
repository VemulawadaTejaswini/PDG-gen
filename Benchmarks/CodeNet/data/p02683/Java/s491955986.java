import java.util.*;
import java.io.*;
public class Main
{
    static BufferedReader br;
    static BufferedWriter bw;
    static void solve()throws Exception
    {
        int nmx[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nmx[0];
        int m = nmx[1];
        int x = nmx[2];
        int A[][] = new int[n][m+1];
        for(int i=0;i<n;i++)
        {
            A[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<(1<<n);i++)
        {
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int j=0;j<n;j++)
            {
                if(((i>>j)&1)==1)
                al.add(j);
            }
            int cost = 0;
            ArrayList<Integer> tem = new ArrayList<Integer>();
            for(int j=0;j<m;j++)
            tem.add(0);
            for(int j =0 ;j<al.size();j++)
            {
                int temp = al.get(j);
                cost+=A[temp][0];
                for(int k=1;k<=m;k++)
                {
                    tem.set(k-1,tem.get(k-1)+A[temp][k]);
                }
            }
            boolean flag =true;
            for(int j=0;j<tem.size();j++)
            {
                if(tem.get(j)<x)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            ans = Math.min(ans,cost);
        }
        if(ans == Integer.MAX_VALUE)
        ans = -1;
        bw.write(Integer.toString(ans));
    }
    public static void main(String []args)throws Exception
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        solve();
        br.close();
        bw.close();
    }
}