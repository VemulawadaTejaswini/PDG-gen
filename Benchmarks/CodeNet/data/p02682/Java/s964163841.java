import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k =sc.nextInt();
        int ans =0;

        if(k<=(a))
        {
            ans = k;
        }
        else
        if(k<=(a+b))
        {
            ans =a;
        }else
        {
            int g = k-a-b;
            if(g>c)
            {
                ans = a-c;
            }
            else
            {
                ans = a-g;
            }
        }
        System.out.println(ans);

    }
}