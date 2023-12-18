import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int R=sc.nextInt();
        int S=sc.nextInt();
        int P=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char arr[]=new char[s.length()];
        long sum=0;
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i)=='r')
            {
                sum+=P;
                arr[i]='p';
            }
            else if(s.charAt(i)=='s')
            {
                sum+=R;
                arr[i]='r';
            }
            else
            {
                sum+=S;
                arr[i]='s';
            }
        }
        for(int i=k;i<n;i++)
        {
            if(s.charAt(i)=='r')
            {
                if(arr[i-k]!='p')
                {
                    sum+=P;
                    arr[i]='p';
                }
                else
                arr[i]='r';
            }
            else if(s.charAt(i)=='s')
            {
                if(arr[i-k]!='r')
                {
                    sum+=R;
                    arr[i]='r';
                }
                else
                arr[i]='s';
            }
            else
            {
                if(arr[i-k]!='s')
                {
                    sum+=S;
                    arr[i]='s';
                }
                else
                {
                    arr[i]='p';
                }
            }
        }
        System.out.println(sum);
    }
}