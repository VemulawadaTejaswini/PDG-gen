
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.next());
        int w = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());

        List<Pair> hmax = new ArrayList<Pair>();
        for (int i = 0; i < h; i++) {
            hmax.add(new Pair(i, 0));
        }
        List<Pair> wmax = new ArrayList<Pair>();
        for (int i = 0; i < w; i++) {
            wmax.add(new Pair(i, 0));
        }
        Set<Pair> set = new HashSet<Pair>();

        for (int i = 0; i < m; i++) {
            int hi = Integer.parseInt(scan.next());
            int wi = Integer.parseInt(scan.next());
            hi--;
            wi--;
            hmax.get(hi).w++;
            wmax.get(wi).w++;
            set.add(new Pair(hi, wi));
        }
        scan.close();

        Collections.sort(hmax, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.w - o1.w;
            }
        });
        Collections.sort(wmax, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.w - o1.w;
            }
        });

        List<Integer> hmaxIndex = new ArrayList<Integer>();
        int hmaxValue = hmax.get(0).w;
        for (Pair p : hmax) {
            if (p.w == hmaxValue) {
                hmaxIndex.add(p.h);
            } else {
                break;
            }
        }
        List<Integer> wmaxIndex = new ArrayList<Integer>();
        int wmaxValue = wmax.get(0).w;
        for (Pair p : wmax) {
            if (p.w == wmaxValue) {
                wmaxIndex.add(p.h);
            } else {
                break;
            }
        }

        int ans = hmaxValue + wmaxValue;
        boolean isMinus = true;
        for (int i : hmaxIndex) {
            for (int j : wmaxIndex) {
                if (!set.contains(new Pair(i, j))) {
                    isMinus = false;
                    break;
                }
            }
        }
        if (isMinus) {
            ans--;
        }

        System.out.println(ans);
    }

    static class Pair {
        int h;
        int w;

        public Pair(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + h;
            result = prime * result + w;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pair other = (Pair)obj;
            if (h != other.h)
                return false;
            if (w != other.w)
                return false;
            return true;
        }

    }
}
