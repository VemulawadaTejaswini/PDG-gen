import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        List<Pair> ls = new ArrayList<>();
        List<Pair> rs = new ArrayList<>();

        for (int i=0; i<n; i++) {
            char[] arr = sc.next().toCharArray();
            int b = 0;
            int h = 0;
            for (int j=0; j<arr.length; j++) {
                if (arr[j] == '(') {
                    h++;
                } else {
                    h--;
                }
                b = Math.min(b, h);
            }
//            System.out.println(b);
//            System.out.println(h);
            if (0 <= b) ls.add(new Pair(b, h));
            else rs.add(new Pair(b-h, -h));
        }

        Collections.sort(ls);
        Collections.sort(rs);

        int h = 0;
        int b = 0;
        int total = 0;

        for (int i=0; i<ls.size(); i++) {
            b = h + ls.get(i).b;
            if (b < 0) {
                System.out.println("No");
                return;
            }
            h += ls.get(i).h;
        }

        for (int i=0; i<rs.size(); i++) {
            b = h + rs.get(i).b;
            if (b < 0) {
                System.out.println("No");
                return;
            }
            h -= rs.get(i).h;
        }

        if (h != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }

    public class Pair implements Comparable<Pair>{
        int b;
        int h;
        public Pair(int b, int h) {
            this.b = b;
            this.h = h;
        }

        public int compareTo(Pair pair) {
            if (this.b < pair.b) return 1;
            if (pair.b < this.b) return -1;
            return 0;
        }

    }
}

