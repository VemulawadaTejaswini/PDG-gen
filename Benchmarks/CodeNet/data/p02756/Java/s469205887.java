import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s = sn.next();
        StringBuilder res = new StringBuilder();
        res.append(s);
        boolean reverseOrNot = false;

        while (sn.hasNextInt()) {
            int T = sn.nextInt();
            if (T == 1) {
                reverseOrNot = !reverseOrNot;
            } else if (T == 2) {
                int F = sn.nextInt();
                String c = sn.next();
                if (reverseOrNot) {
                    if (F == 1) F = 2;
                    else F = 1;
                }
                if (F == 1) {
                    res.insert(0, c);
                } else {
                    res.append(c);
                }
            }
        }
        if (reverseOrNot) {
            res.reverse();
        }
        System.out.println(res);
    }
}