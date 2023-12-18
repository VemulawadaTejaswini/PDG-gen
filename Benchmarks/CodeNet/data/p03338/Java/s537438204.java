import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int n;
        String s;
        try (Scanner cin = new Scanner(System.in)) {
            n = cin.nextInt();
            s = cin.next();
        }

        int sameMax = 0;
        for (int i = 1; i < n; i++) {
            char[] x = s.substring(0, i).toCharArray();
            char[] y = s.substring(i, n).toCharArray();
            Set<Character> xset = new HashSet<Character>();
            for (int j = 0; j < x.length; j++) xset.add(x[j]);
            Set<Character> yset = new HashSet<Character>();
            for (int j = 0; j < y.length; j++) yset.add(y[j]);
            xset.retainAll(yset);
            sameMax = Math.max(xset.size(), sameMax);
        }

        System.out.println(sameMax);
    }

}
