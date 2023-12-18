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
        String[] input = reader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        BigDecimal b = new BigDecimal(Integer.parseInt(input[1]));
        BigDecimal c = new BigDecimal(Integer.parseInt(input[2]));

        for (int x = 1; x <= 10000; x++) {
            BigDecimal ax = new BigDecimal(a*x);
            BigDecimal remain = ax.divideAndRemainder(b)[1];
            if (remain.compareTo(c) == 0) {
                System.out.print("Yes");
                return;
            }
        }

        System.out.println("No");



//        PrintWriter writer = new PrintWriter(System.out);
//
//        writer.close();


    }
}
