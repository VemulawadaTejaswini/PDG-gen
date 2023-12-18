import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        a=a+c;
        c=a-c;
        a=a-c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }}
        