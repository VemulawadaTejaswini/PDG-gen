import java.util.*;

public class Main {
    static int primeCounter = 0;

    public static void main (String args[]) {
        // input

        int numEl;
        int numb;

        Scanner inp = new Scanner(System.in);

        numEl = inp.nextInt();

        for (int i = 0; i < numEl; i++) {
            prime_Counter(inp.nextInt());
        }

        System.out.println(primeCounter);
    }

    public static void prime_Counter(int numb) {
        Boolean primeOrNot = isPrime(numb);

        if (primeOrNot == true) {
            primeCounter++;
        }
    }

    public static boolean isPrime(int numb) {
        for(int i = 2; i < numb; i++) {
            if(numb%i == 0) {
                return false;
            }
        }

        return true;
    }
}

