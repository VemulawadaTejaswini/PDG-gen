import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Pair1 implements Comparable<Pair1> {
    int h;
    int b;
    public Pair1(int h, int b) {
        this.h = h;
        this.b = b;
    }

    @Override
    public int compareTo(Pair1 other) {
        return Integer.compare(this.b, other.b);
    }
}

class Solver {

    private boolean check(List<Pair1> a) {
        int cur = 0;
        for (Pair1 p :a) {
            if (cur + p.b < 0) return false;
            cur += p.h;
        }
        return true;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //System.out.println("============");
        int total = 0;
        List<Pair1> ls = new ArrayList<Pair1>();
        List<Pair1> rs = new ArrayList<Pair1>();
        List<String> S = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            int h = 0, b =0;
            for (char ch : s.toCharArray()) {
                if (ch == '(') h++;
                else h--;
                b = Math.min(h, b);
            }
            if (h >= 0) ls.add(new Pair1(h, b));
            else rs.add(new Pair1(-h, b-h));
            total += h;
        }
        //System.out.println("============");
        Collections.sort(ls);
        Collections.sort(rs);

        if (check(ls) && check(rs) && total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        return;
    }

}