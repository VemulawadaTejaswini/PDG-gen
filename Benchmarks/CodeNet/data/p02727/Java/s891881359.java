//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        String s[]=br.readLine().trim().split(" ");
        int X=Integer.parseInt(s[0]);
        int Y=Integer.parseInt(s[1]);
        int A=Integer.parseInt(s[2]);
        int B=Integer.parseInt(s[3]);
        int C=Integer.parseInt(s[4]);

        Long red[]=new Long[A];
        Long green[]=new Long[B];
        Long either[]=new Long[C];

        s=br.readLine().trim().split(" ");
        for(i=0;i<A;i++)
            red[i]=Long.parseLong(s[i]);
        s=br.readLine().trim().split(" ");
        for(i=0;i<B;i++)
            green[i]=Long.parseLong(s[i]);
        s=br.readLine().trim().split(" ");
        for(i=0;i<C;i++)
            either[i]=Long.parseLong(s[i]);

        Arrays.sort(red,Collections.reverseOrder());
        Arrays.sort(green,Collections.reverseOrder());
        Arrays.sort(either,Collections.reverseOrder());

        long sumA=0,sumB=0;
        for(i=0;i<X;i++) sumA+=red[i];
        for(i=0;i<Y;i++) sumB+=green[i];

        int x=X-1,y=Y-1;
        for(i=0;i<C&&x>=0&&y>=0;i++)
        {
            if(either[i]<=Math.min(red[x],green[y])) break;
            if(red[x]<green[y])
            {
                sumA+=either[i];
                sumA-=red[x--];
            }
            else
            {
                sumB+=either[i];
                sumB-=green[y--];
            }
        }
        while (i<C&&x>=0&&either[i]>red[x])
        {
            sumA+=either[i++];
            sumA-=red[x--];
        }
        while (i<C&&y>=0&&either[i]>green[y])
        {
            sumB+=either[i++];
            sumB-=green[y--];
        }

        System.out.println(sumA+sumB);
    }
}