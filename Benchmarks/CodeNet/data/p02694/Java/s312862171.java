import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long start = 100;
        int years = 0;
        while(start < n)
        {
            start *= 1.01;
            years++;
        }
        System.out.println(years);
    }
}
