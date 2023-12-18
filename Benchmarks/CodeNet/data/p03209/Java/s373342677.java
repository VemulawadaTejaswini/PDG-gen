import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        long eatp = 0;
        long eati = n;
        boolean th = false;
        for (long i = n; i > 0; i--) {
            if ((eati - i) + Math.pow(2, i + 2) - 3 <= x) {
                th = true;
                eatp += Math.pow(2, i + 1) - 1;
                x -= (eati - i) + Math.pow(2, i + 2) - 3;
                eati = i;
                if (x == 0) {
                    break;
                } else {
                    x--;
                    eatp++;
                }
            }
        }
        if (!th) {
            x--;
        } else {
            x -= eati - 1;
        }
        if (x == 2) {
            eatp++;
        } else if (x == 3) {
            eatp += 2;
        } else if (x == 4) {
            eatp += 3;
        }
        System.out.println(eatp);
    }
}