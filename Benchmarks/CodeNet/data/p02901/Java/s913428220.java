import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Scanner;

class Key{
    final int cost;
    final BitSet open;

    Key(int cost, BitSet open){
        this.cost = cost;
        this.open = open;
    }
}

class Solver {

    private final Key[] keys;
    private final int N;
    private final int M;

    Solver(Scanner in){
        N = in.nextInt();
        M = in.nextInt();
        keys = new Key[M];
        for (int i = 0; i < M; i++) {
            int cost = in.nextInt();
            int B = in.nextInt();
            BitSet bits = new BitSet(N);
            for (int j = 0; j < B; j++) {
                bits.set(in.nextInt());
            }
            keys[i] = new Key(cost, bits);
        }
    }

    void solve() {
        BitSet opened = new BitSet(N);
        long cost = 0;
        for (int i = 0; i < M; i++) {
            Arrays.sort(keys, Comparator.comparingDouble((Key k) ->{
                k.open.andNot(opened);
                int cardinality = k.open.cardinality();
                if (cardinality == 0) return Integer.MAX_VALUE;
                return 1. * k.cost / cardinality;
            }));
            Key key = keys[0];
            opened.or(key.open);
            cost+=key.cost;
            if (opened.cardinality() >= N){
                System.out.println(cost);
                return;
            }
        }
        System.out.println(-1);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}