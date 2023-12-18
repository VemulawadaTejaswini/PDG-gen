import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();
        int numDigits = scanner.nextInt();
        boolean[] badDigits = new boolean[10];
        
        for (int i=0; i<numDigits; i++) {
            int badDigit = scanner.nextInt();
            badDigits[badDigit] = true;
        }
        
        // we can have possible change of 1 to 100,000
        // In case we can't pay the initial amount with x digits we pad one more digit.
        
        for (int change=cost; change<100000; change++) {
            // give up on change amount if she hates a digit
            int currChange = change;
            while (currChange > 0) {
                int currDigit = currChange % 10;
                if (badDigits[currDigit])
                    break;
                else {
                    currChange /= 10;
                }
            }
            // currChange = 0 OR we had a bad digit
            if (currChange == 0) {
                System.out.println(change);
                break;
            }
            
        }
        scanner.close();
    }
}
