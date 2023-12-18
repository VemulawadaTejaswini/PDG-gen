import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int X=Integer.parseInt(s[0]);
        int Y=Integer.parseInt(s[1]);
        int A=Integer.parseInt(s[2]);
        int B=Integer.parseInt(s[3]);
        int C=Integer.parseInt(s[4]);
        PriorityQueue<Integer> a=new PriorityQueue<Integer>(1,Collections.reverseOrder());
        PriorityQueue<Integer> b=new PriorityQueue<Integer>(1,Collections.reverseOrder());
        PriorityQueue<Integer> c=new PriorityQueue<Integer>(1,Collections.reverseOrder());
        StringTokenizer st1=new StringTokenizer(br.readLine()," ");
        while(st1.hasMoreTokens()) a.add(Integer.parseInt(st1.nextToken()));
        StringTokenizer st2=new StringTokenizer(br.readLine()," ");
        while(st2.hasMoreTokens()) b.add(Integer.parseInt(st2.nextToken()));
        StringTokenizer st3=new StringTokenizer(br.readLine()," ");
        while(st3.hasMoreTokens()) c.add(Integer.parseInt(st3.nextToken()));
        PriorityQueue<Integer> ans=new PriorityQueue<Integer>(1,Collections.reverseOrder());
        for(int i=0;i<X;i++) ans.add(a.poll());
        for(int i=0;i<Y;i++) ans.add(b.poll());
        for(int i=0;i<C;i++) ans.add(c.poll());
        for(int i=X+Y+C;i>X+Y;i--) ans.poll();
        long sum=0;
        for(int i=0;i<X+Y;i++) sum+=ans.poll();
        System.out.println(ans);
    }
}