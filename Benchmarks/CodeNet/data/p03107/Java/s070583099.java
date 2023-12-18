import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char [] cs = s.toCharArray();
        int n = s.length();

        // Key insight: as long as #0's > 0 and #1's > 1, there will always be a 0 and 1 touching somewhere. Reason: any streak of say 0's must have in at least one of the ends a 1

        int numZeros = 0;
        int numOnes = 0;

        for (char c : cs) {
            if (c == '0') {
                numZeros++;
            } else {
                numOnes++;
            }
        }

        System.out.println(2 * Math.min(numZeros, numOnes));
    }
}