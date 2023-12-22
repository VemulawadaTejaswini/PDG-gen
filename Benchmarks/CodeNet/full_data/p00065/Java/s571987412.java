import java.util.Scanner;
public class Main
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int t1[]=new int[1001];
        int t2[]=new int[1001];
        for(;;)
        {
            String s[]=in.nextLine().split(",");
            if(s[0].compareTo("")==0)
                break;
            t1[Integer.valueOf(s[0])]++;
        }
        while(in.hasNext())
        {
            String s[]=in.nextLine().split(",");
            t2[Integer.valueOf(s[0])]++;
        }
        for(int i=0;i<=1000;i++)
        {
            if(t1[i]>0&&t2[i]>0)
                System.out.println(i+" "+(t1[i]+t2[i]));
        }
    }
}
