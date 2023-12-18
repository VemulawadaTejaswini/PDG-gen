import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Pair implements Comparable<Pair> {
    int price;
    int stock;

    public Pair(int price, int stock){
        this.price = price;
        this.stock = stock;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.price, other.price);
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        List<Pair> shoplist = new ArrayList<Pair>();
        for (int i = 0; i < N; i++) {
            Pair p = new Pair(sc.nextInt(), sc.nextInt());
            shoplist.add(p);
        }

        Collections.sort(shoplist);

        long sum = 0;
        long cnt = M;
        for (Pair p : shoplist) {
            if (cnt > p.stock) {
                sum += p.stock * p.price;
                cnt -= p.stock;
            } else {
                // cnt <= p.stock
                sum += cnt * p.price;
                break;
            }
        }

        System.out.println(sum);
        return;
    }

}
