import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String S = in.next();
            char[] cs = S.toCharArray();

            ArrayList<Integer> l = new ArrayList<>();
            char prev = cs[0];
            int count = 1;
            for (int i = 1; i <= cs.length; i++) {
                if (i == cs.length) {
                    l.add(prev == '.' ? count : -count);
                    continue;
                }
                if (cs[i] != prev) {
                    l.add(prev == '.' ? count : -count);
                    count = 1;
                    prev = cs[i];
                    continue;
                }
                count++;
            }

            if (l.size() > 0 && l.get(0).intValue() > 0) {
                l.remove(0);
            }
            if (l.size() > 0 && l.get(l.size() - 1).intValue() < 0) {
                l.remove(l.size() - 1);
            }

            int countW = 0;
            int countB = 0;
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) < 0) {
                    countB += -l.get(i).intValue();
                } else {
                    countW += l.get(i).intValue();
                }
            }

            System.out.println(Math.min(countW, countB));
        }
    }
}
