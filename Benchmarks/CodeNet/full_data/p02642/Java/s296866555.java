import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        HashMap<Integer,Integer> ind=new HashMap<>();
        int n=Integer.parseInt(br.readLine());
        int cnt[]=new int[1000001];
        String str[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        {
            cnt[Integer.parseInt(str[i])]++;
            ind.put(Integer.parseInt(str[i]),i+1);
        }
        int ans=0;
        for(int i=1;i<=1000000;i++)
        {
            if(cnt[i]>0&&cnt[i]==1)
            {
                boolean got=true;
                for(int j=2;j<(int)Math.ceil(Math.sqrt(i));j++)
                {
                    if(i%j==0)
                    {
                        if(cnt[j]>0||cnt[i/j]>0)
                        {
                            got=false;
                            break;
                        }
                    }
                }
                if(got)
                {
                    ans=i;
                    break;
                }
            }
        }
        if(ans==0)
        pw.println(ans);
        else
        pw.println(ind.get(ans));
        pw.flush();
        pw.close();
    }
}