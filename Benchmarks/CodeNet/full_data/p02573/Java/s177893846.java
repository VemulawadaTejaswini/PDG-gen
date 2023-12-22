import java.util.*;
import java.io.*;
public class Main
{
    static HashMap<Integer,Integer> h;
    static int v=0;
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int q=Integer.parseInt(st.nextToken());
        h=new HashMap<>(q);
        StringBuilder sb=new StringBuilder("");
        int c=0;
        while(q-->0)
        {
            String s=br.readLine();
            int a=Integer.parseInt(s.substring(0,s.indexOf(' ')));
            int b=Integer.parseInt(s.substring(s.indexOf(' ')+1));
            int v1=0;
            int v2=0;
            int p1=0;
            int p2=0;
            if(!h.containsKey(a))
            {
                h.put(a,-1);
                v1=1;
                p1=a;
            }
            else
            {
                v=0;
                p1=find(a);
                v1=v;
            }
            if(!h.containsKey(b))
            {
                h.put(b,-1);
                v2=1;
                p2=b;
            }
            else
            {
                v=0;
                p2=find(b);
                v2=v;
            }
            if(p1==p2)
            {
                sb.append(c+"\n");
                continue;
            }
          //  System.out.println(v1+" "+v2+" "+h);
            if(v1>v2)
            {
                h.put(p1,-1*(v1+v2));
                h.put(p2,p1);
                c=Math.max(-1*h.get(p1),c);
            }
            else
            {
                h.put(p2,-1*(v1+v2));
                h.put(p1,p2);
                c=Math.max(-1*h.get(p2),c);
            }
            sb.append(c+"\n");
        }
       // System.out.println(h);
        int cc=1;
        for(int a:h.keySet())
        {
        	if(h.get(a)<0)cc=Math.max(-1*h.get(a),cc);
        }
        System.out.println(cc);
    }
    static int find(int a)
    {
        if(h.get(a)<=-1)
        {
            v=h.get(a)*-1;
            return a;
        }
        int val=find(h.get(a));
        h.put(a,val);
        return val;
    }
}
