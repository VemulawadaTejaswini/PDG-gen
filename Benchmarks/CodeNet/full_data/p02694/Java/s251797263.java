import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        long count = 0;
        long value = 100;
        while (true)
        {
            value *= 1.01;
            //System.out.println(value);
            ++count;
            if (value >= x) break;
        }
        System.out.println(count);
        sc.close();
    }
}