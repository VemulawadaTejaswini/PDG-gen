
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),m=s.nextInt();
        int height[] = new int[n+1];
        for(int i=0;i<n;i++)height[i+1]=s.nextInt();
        HashMap<Integer, PriorityQueue<Integer>>hm = new HashMap<>();
        PriorityQueue<Integer>priorityQueue;
        for(int i=0;i<n;i++){
            priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            hm.put(i+1,priorityQueue);
        }
        for(int i=0;i<m;i++){
            int u = s.nextInt(),v=s.nextInt();
            priorityQueue = hm.get(u);
            priorityQueue.add(height[v]);
            hm.put(u,priorityQueue);
            priorityQueue = hm.get(v);
            priorityQueue.add(height[u]);
            hm.put(v,priorityQueue);

        }
        int cnt=0;

        for(int i=1;i<=n;i++){
            priorityQueue = hm.get(i);
            if(priorityQueue.isEmpty())cnt++;
            else if(priorityQueue.peek()<height[i])cnt++;
        }

        System.out.println(cnt);


    }
}




class Scanner
{
    StringTokenizer st;
    BufferedReader br;

    public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

    public String next() throws IOException
    {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public int nextInt() throws IOException {return Integer.parseInt(next());}

    public long nextLong() throws IOException {return Long.parseLong(next());}

    public String nextLine() throws IOException {return br.readLine();}

    public double nextDouble() throws IOException
    {
        String x = next();
        StringBuilder sb = new StringBuilder("0");
        double res = 0, f = 1;
        boolean dec = false, neg = false;
        int start = 0;
        if(x.charAt(0) == '-')
        {
            neg = true;
            start++;
        }
        for(int i = start; i < x.length(); i++)
            if(x.charAt(i) == '.')
            {
                res = Long.parseLong(sb.toString());
                sb = new StringBuilder("0");
                dec = true;
            }
            else
            {
                sb.append(x.charAt(i));
                if(dec)
                    f *= 10;
            }
        res += Long.parseLong(sb.toString()) / f;
        return res * (neg?-1:1);
    }

    public boolean ready() throws IOException {return br.ready();}


}