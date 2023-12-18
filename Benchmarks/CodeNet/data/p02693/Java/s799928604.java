import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        boolean works = false;
        for(int i = a; i <= b; i++)
        {
            if(i % k == 0)
            {
                works = true;
            }
        }
        if(works)
        {
            System.out.println("OK");
        }
        else
        {
            System.out.println("NG");
        }
    }
}
