import java.util.*;

public class A {
    static class Rect implements Comparable<Rect> {
        int h;
        int w;
        int d2;

        public Rect(int h, int w) {
            this.h = h;
            this.w = w;
            this.d2 = h * h + w * w;
        }

        @Override
        public int compareTo(Rect other) {
            if (d2 != other.d2) {
                return Integer.compare(d2, other.d2);
            }
            return Integer.compare(h, other.h);
        }

        @Override
        public boolean equals(Object other) {
            return compareTo((Rect) other) == 0;
        }
    }

    public static void main(String[] args) {
        List<Rect> candidates = new ArrayList<Rect>();
        for (int h = 1; h <= 150; h++) {
            for (int w = h + 1; w <= 150; w++) {
                candidates.add(new Rect(h, w));
            }
        }
        Collections.sort(candidates);

        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h == 0 && w == 0) {
                break;
            }
            Rect rect = new Rect(h, w);
            Rect ansRect = candidates.get(candidates.indexOf(rect) + 1);
            System.out.println(ansRect.h + " " + ansRect.w);
        }
        sc.close();
    }
}