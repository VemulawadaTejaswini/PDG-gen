import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}


class Pair implements Comparable<Pair> {
    int order;
    int index;

    public Pair(int order, int index) {
        this.order = order;
        this.index = index;
    }

    @Override
    public int compareTo(Pair other) {
        return this.order - other.order;
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Pair> d = new ArrayList<Pair>();

        for (int i = 0; i < N; i++) {
            d.add(new Pair(sc.nextInt(), i));
        }
        Collections.sort(d);

        StringBuilder sb = new StringBuilder();
        for (Pair p : d) {
            sb.append(p.index + 1);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());

        return;
    }

}