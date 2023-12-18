import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}


class Item implements Comparable<Item> {

    public String S;
    public int P;
    public int idx;


    public Item (int idx, String name, int point) {
        this.idx = idx;
        this.S = name;
        this.P = point;
    }

    @Override
    public int compareTo(Item other) {
        int ret1 = S.compareTo(other.S);
        if (ret1 != 0) return ret1;

        return -Integer.compare(P, other.P);
    }
    
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Item> list = new ArrayList<Item>();
        for (int i = 0; i < N; i++) {
            list.add(new Item(i + 1, sc.next(), sc.nextInt()));
        }

        Collections.sort(list);

        for (Item e : list) {
            System.out.println(e.idx);
        }

        return;
    }

}