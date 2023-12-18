import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int max;
        max=Math.max(n+m,n-m);
        max=Math.max(max,n*m);
        System.out.println(max);
    }
}
