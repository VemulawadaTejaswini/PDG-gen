import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    private static long gcd(long a, long b)
    {
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static long lcm(long a, long b)
    {
        return a * (b / gcd(a, b));
    }

    private static long lcm(long[] input)
    {
        long result = input[0];
        for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
        return result;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] input = reader.readLine().toCharArray();

        int N= 0, S= 0, W= 0, E= 0;

        for (int i = 0; i < input.length; i++) {
            if ('N' == input[i]) N++;
            if ('S' == input[i]) S++;
            if ('W' == input[i]) W++;
            if ('E' == input[i]) E++;
        }

        boolean nsp  = false;
        if (N + S != 0 && N != 0 && S != 0)
            nsp = true;
        else if (N == 0 && S ==0)
            nsp = true;

        boolean ewp  = false;
        if (E + W != 0 && E != 0 && W != 0)
            ewp = true;
        else if (E == 0 && W ==0)
            ewp = true;

        if (ewp==true&&nsp==true)
            System.out.print("Yes");
        else
            System.out.print("No");


//        PrintWriter writer = new PrintWriter(System.out);
//
//        writer.close();


    }
}
