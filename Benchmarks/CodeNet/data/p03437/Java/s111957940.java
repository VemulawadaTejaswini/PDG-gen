import java.util.Scanner;
public class Main

{
    public static void main(String arg[])
    {
        int a,b;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        if(a%b==0||b%a==0)
        System.out.println("-1");
        if(a==b)
        System.out.println("-1");
        int c=a;
        while(2>1)
        {
            c=c+a;
            if(c%a==0&&c%b!=0&&c!=a)
            {
            System.out.println(c);
            break;
            }
            if(c>b)
            break;
        }
    }
}