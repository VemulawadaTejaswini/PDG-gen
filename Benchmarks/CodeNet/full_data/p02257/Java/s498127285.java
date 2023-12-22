import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Greatest Common Divisor
 *
 */
public class Main {
    
    public static void main(String[] args) {
        // input data
        List<String> input = inputLines();
        
        // get data
        int counter = 0;
        
        // main logic
        for (String target : input) {
            counter += isPrimeNumber(Integer.valueOf(target)) ? 1 : 0;
        }
        output(counter);
    }

    private static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        
        // ??¶??°
        if (n % 2 == 0) {
            return false;
        }
        
        // ?\???°
        for (int i = 3; i <= n / i; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    private static List<String> mocups() {
        List<String> input = Arrays.asList(
                "6",
                "1",
                "3",
                "6",
                "4",
                "5",
                "17",
                "3"
                );
        return input;
    }

    /** output data */
    private static void output(Object o) {
        System.out.println(o);
    }
    private static void output(String[] o) {
        System.out.println(Arrays.toString(o));
    }
    private static void output(int[] o) {
        System.out.println(Arrays.toString(o));
    }
    private static void output(Object[] o) {
        System.out.println(Arrays.toString(o));
    }

    /** input data */
    private static List<String> inputLines() {
        Scanner in = new Scanner(System.in);
        List<String> input = new ArrayList<String>();
        while(in.hasNext()) {
            String buf = in.nextLine();
            input.add(buf);
        }
        in.close();
        return input;
    }

}