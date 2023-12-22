import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int pos,steps,dis;
        pos=s.nextInt();
        steps=s.nextInt();
        dis=s.nextInt();
       
        System.out.println(minPath(steps+1,dis,pos));

    }
    public static int minPath(int steps,int dis,int pos)
    {
        if(steps==1)
        {
            return pos;
        }
        int temp=pos-dis;
        if(temp<0)
        {
            temp=-temp;
        }
       return (Math.min(minPath(steps-1,dis,pos+dis),minPath(steps-1,dis,temp)));
    
    }
}