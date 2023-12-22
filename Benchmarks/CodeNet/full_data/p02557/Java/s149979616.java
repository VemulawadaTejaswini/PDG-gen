//created by Whiplash99
import java.io.*;
import java.sql.Array;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        N=Integer.parseInt(br.readLine().trim());
        String[] s=br.readLine().trim().split(" ");
        int a[]=new int[N];
        for(i=0;i<N;i++) a[i]=Integer.parseInt(s[i]);

        s=br.readLine().trim().split(" ");
        int b[]=new int[N];
        for(i=0;i<N;i++) b[i]=Integer.parseInt(s[i]);

        ArrayDeque<Integer> Q=new ArrayDeque<>();
        for(i=0;i<N;i++) Q.add(b[i]);
        boolean flag=true;

        for(i=0;i<N;i++)
        {
            if(a[i]==Q.peek())
            {
                int lim=Q.size();
                while (lim-->0&&Q.peek()==a[i])
                    Q.add(Q.poll());
                if(Q.peek()==a[i])
                {
                    flag=false;
                    break;
                }
            }
            a[i]=Q.poll();
        }
        if(!flag) System.out.println("No");
        else
        {
            System.out.println("Yes");
            StringBuilder sb=new StringBuilder();
            for(i=0;i<N;i++) sb.append(a[i]).append(" ");
            System.out.println(sb);
        }
    }
}