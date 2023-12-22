import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=0;i<n;++i)
        {
            int k=sc.nextInt();
            int p=sc.nextInt();

            int a=k%p;
            if (a!=0) {System.out.println(a);}
            else {System.out.println(p);}
        }
    }
}
