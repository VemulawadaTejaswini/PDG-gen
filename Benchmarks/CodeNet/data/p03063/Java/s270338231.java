import java.util.ArrayList;
import java.util.Scanner;

import util.Utils;

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
                if (i == cs.length || cs[i] != prev) {
                    l.add(prev == '.' ? count : -count);
                    count = 0;
                    if (i == cs.length) {
                        continue;
                    }
                }
                count++;
                prev = cs[i];
            }

            if (l.size() > 0 && l.get(0).intValue() > 0) {
                l.remove(0);
            }
            if (l.size() > 0 && l.get(l.size() - 1).intValue() < 0) {
                l.remove(l.size() - 1);
            }

            l.add(0, 0);
            l.add(0);

//            Utils.debug(l);

            int[] cumsumW = new int[l.size()];
            int[] cumsumB = new int[l.size()];
            for (int i = 0; i < l.size(); i++) {
                int n = l.get(i).intValue();
                cumsumW[i] = (n <= 0 ? -n : 0) + (i - 1 >= 0 ? cumsumW[i - 1] : 0);
            }
            for (int i = l.size() - 1; i >= 0; i--) {
                int n = l.get(i).intValue();
                cumsumB[i] = (n >= 0 ? n : 0) + (i + 1 < l.size() ? cumsumB[i + 1] : 0);
            }

            int res = (int) 1e9;
            for (int i = 0; i + 1 < l.size(); i++) {
                res = Math.min(res, cumsumW[i] + cumsumB[i + 1]);
//                Utils.debug(i, cumsumW[i], cumsumB[i + 1], cumsumW[i] + cumsumB[i + 1]);
            }

            System.out.println(res);
        }
    }
}
