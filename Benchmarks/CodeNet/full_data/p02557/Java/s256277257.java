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
        ArrayList<Integer> b=new ArrayList<>();
        for(i=0;i<N;i++) b.add(Integer.parseInt(s[i]));
        b.sort(Collections.reverseOrder());

        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayDeque<Integer> Q=new ArrayDeque<>();
        for(i=0;i<N;i++)
        {
            Q.add(b.get(i));
            map.put(b.get(i),map.getOrDefault(b.get(i),0)+1);
        }
        boolean flag=true;

        for(i=0;i<N;i++)
        {
            if(a[i]==Q.peek())
            {
                if(map.size()==1)
                {
                    flag=false;
                    break;
                }
                while (Q.peek()==a[i]) Q.add(Q.poll());
            }
            a[i]=Q.poll();
            if(map.get(a[i])==1) map.remove(a[i]);
            else map.put(a[i],map.get(a[i])-1);
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