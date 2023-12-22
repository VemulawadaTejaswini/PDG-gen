import java.util.*;

public class Main {
    public static void main (String args[]) {
        // input

        int numEl;
        int numb;

        Scanner inp = new Scanner(System.in);

        numEl = inp.nextInt();

        int primeCounter = 0;

        for(int i = 0; i < numEl; i++) {
            numb = inp.nextInt();

            Boolean primeOrNot = true;

            for(int k = 2; i < numb; k++) {
                if(numb%k == 0) {
                    primeOrNot = false;
                }
            }

            if (primeOrNot == true) {
                primeCounter++;
            }
        }

        System.out.println(primeCounter);
    }
}

