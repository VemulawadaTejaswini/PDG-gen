import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<10000;++i)
        {
            if (1000 * i >= n)
            {
                System.out.println((1000*i) - n);
                break;
            }
        }
        sc.close();
    }
}