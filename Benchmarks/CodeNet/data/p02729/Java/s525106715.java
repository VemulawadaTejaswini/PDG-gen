import java.util.*;

public class Main {
    public static void main(String [] args)
    {
        long even, odd;


        Scanner sc = new Scanner(System.in);
        even = sc.nextLong();
        odd = sc.nextLong();

        long evenTot = (factorial(even))/(factorial(even-2)*factorial(2));
        long oddTot = factorial(odd)/(factorial(odd-2)*factorial(2));
        System.out.print(evenTot+oddTot);
    }

    public static long factorial(long n)
    {
        if(n <= 1)
        {
            return 1;
        }
        else
        {
            return n*(factorial(n-1));
        }
    }
}
