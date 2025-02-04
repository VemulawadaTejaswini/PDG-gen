import java.math.BigInteger;
import java.util.*;

public class Main {
    static int primeCounter = 0;

    public static void main(String args[]) {
        // input

        int numEl;

        Scanner inp = new Scanner(System.in);

        numEl = inp.nextInt();

        while (inp.hasNext()) {
            BigInteger input = new BigInteger(inp.next());

            if (input.isProbablePrime(5)) {
                primeCounter++;
            }
        }
    }
}
