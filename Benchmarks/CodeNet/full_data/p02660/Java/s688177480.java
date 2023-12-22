import java.util.*;
import java.io.*;
public class Main {
    public static void main (String [] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(in.readLine());
        long divider = 1;
        ArrayList<Long> done = new ArrayList<Long>();
        
        
        
        
        int times = 0;
        for(long i = 2; i <= number; i++)
        {
            boolean runLoop = number % i == 0;
            boolean isPrime = runLoop;
            for(long j = 2; j < Math.sqrt(i) && runLoop; j++)
            {
                if(i % j == 0)
                    isPrime = false;
            }
            if(isPrime)
            {
                boolean primeLoop = true;
                long primeExp = i;
                while(primeLoop)
                {
                    if(number % primeExp == 0)
                    {
                        times++;
                        
                        number /= primeExp;
                        primeExp *= i;
                    }
                    else
                    {
                        primeLoop = false;
                    }
                }
            }
        }

        System.out.println(times);
        


    }
}