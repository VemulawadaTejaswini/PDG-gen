import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s = sn.next();
        boolean reverseOrNot = false;
        StringBuilder head = new StringBuilder();
        StringBuilder tail = new StringBuilder();

        while (sn.hasNextInt()) {
            int T = sn.nextInt();
            if (T == 1) {
                reverseOrNot = !reverseOrNot;
            } else if (T == 2) {
                int F = sn.nextInt();
                String c = sn.next();
                if (reverseOrNot) {
                    if (F == 1) tail.append(c);
                    else head.append(c);
                } else {
                    if (F == 1) head.append(c);
                    else tail.append(c);
                }
            }
        }
        if (!reverseOrNot) {
            head.reverse();
            head.append(s);
            head.append(tail);
            System.out.println(head);
        } else {
            tail.reverse();
            StringBuilder res = new StringBuilder(s);
            res.reverse();
            tail.append(res);
            tail.append(head);
            System.out.println(tail);
        }
    }
}
